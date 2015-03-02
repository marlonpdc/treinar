import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DosagemABCP {
	
	Double cimento;
	AgregadoGraudo brita = new AgregadoGraudo();
	AgregadoMiudo areia = new AgregadoMiudo();
	Agua agua = new Agua();
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void calcularTraco () {
		// Entrada do fator água cimento
		Double fatAguaCimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o fator água/cimento"));
		brita.dmc = Double.parseDouble(JOptionPane.showInputDialog("Insira o diâmetro máximo característico da brita\n"
				+ "[valores referência (mm): 9.5; 19.0; 25.0; 32.0; 38.0]"));
		brita.massaUnitaria = Double.parseDouble(JOptionPane.showInputDialog("Insira a massa unitária da brita\n"
				+ "[referência: 2700 kg/m3 (Brita calcária)] "));
		areia.mf = Double.parseDouble(JOptionPane.showInputDialog("Insira o módulo de finura da areia\n"
				+ "([referência: 1.8; 2.0; 2.2; 2.4; 2.6; 2.8; 3.0; 3.2; 3.4; 3.6])"));
		areia.massaUnitaria = Double.parseDouble(JOptionPane.showInputDialog("Insira a massa unitária da areia\n"
				+ "[referência: 2650 kg/m3 (Sílica)]"));
		Double massaEspecificaCimento = Double.parseDouble(JOptionPane.showInputDialog("Insira a massa específica do cimento\n"
				+ "[referência: 2800 a 3200 kg/cm3]"));
		Double slump = Double.parseDouble(JOptionPane.showInputDialog("Insira o slump (< 100 mm)"));
		
		// Cálculo dos consumos em massa de cada componente
		Integer consumoAgua = agua.calcularConsumoAgua(brita.dmc, slump);
		cimento = consumoAgua / fatAguaCimento;
		Double consumoBrita = brita.calcularConsumoAgregadoGraudo(brita.dmc, areia.mf);
		Double consumoAreia = (1 - (cimento / massaEspecificaCimento + consumoBrita / brita.massaUnitaria + consumoAgua / 1000)) * areia.massaUnitaria;
		
		// Proporcionamento
		Double tracoBrita = consumoBrita / cimento;
		Double tracoAreia = consumoAreia / cimento;
		
		// Print do traço
		JOptionPane.showMessageDialog(null, "TRAÇO\n" + "1" + " : " + df.format(tracoBrita) + " : "  + df.format(tracoAreia) + " : "+ df.format(fatAguaCimento));		
		
		// Consumo em massa dos componentes
		JOptionPane.showMessageDialog(null,"Consumo cimento: " + df.format(cimento) + "kg\n"
				+ "Consumo brita: " + df.format(consumoBrita) + "kg\n"
				+ "Consumo areia: " + df.format(consumoAreia) + "kg\n"
				+ "Consumo água: " + df.format(consumoAgua) + "kg");

	}
	
	

}
