package br.com.quartetoalegreto.orcamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.quartetoalegreto.orcamento.modelo.Cliente;
import br.com.quartetoalegreto.orcamento.modelo.Evento;
import br.com.quartetoalegreto.orcamento.modelo.Orcamento;
import br.com.quartetoalegreto.orcamento.modelo.Telefone;

public class Util {

	public static List<Orcamento> orcamentos;
	
	static {
		Orcamento o = null;
		orcamentos = new ArrayList<Orcamento>();
		for (int i = 0; i < 10; i++) {
			o = new Orcamento();
			o.setCodigoOrcamento("1048" + i);
			o.setCliente(new Cliente());
			o.getCliente().setNome("Gleidosn");
			o.getCliente().setTelefone(new Telefone());
			o.setEvento(new Evento());
			o.getEvento().setDataInicio(new Date());
			o.getEvento().setEndereco("Endereco " + (i + 1));
			orcamentos.add(o);
		}
		
	}
	
}
