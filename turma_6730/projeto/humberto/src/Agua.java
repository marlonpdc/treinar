
public class Agua {
	Integer consumo;
	
	public Integer calcularConsumoAgua(Double dmc, Double slump) {
		
		if (40 < slump && slump <= 60.0) {
			if (dmc == 9.5) {
				this.consumo = 220;
			}
			if (dmc == 19) {
				this.consumo = 195;
			}
			if (dmc == 25) {
				this.consumo = 190;
			}
			if (dmc == 32) {
				this.consumo = 185;
			}
			if (dmc == 38) {
				this.consumo = 180;
			}
		}
		if (60 < slump && slump <= 80.0) {
			if (dmc == 9.5) {
				this.consumo = 225;
			}
			if (dmc == 19) {
				this.consumo = 200;
			}
			if (dmc == 25) {
				this.consumo = 195;
			}
			if (dmc == 32) {
				this.consumo = 190;
			}
			if (dmc == 38) {
				this.consumo = 185;
			}
		}
		if (80 < slump && slump <= 100.0) {
			if (dmc == 9.5) {
				this.consumo = 230;
			}
			if (dmc == 19) {
				this.consumo = 205;
			}
			if (dmc == 25) {
				this.consumo = 200;
			}
			if (dmc == 32) {
				this.consumo = 195;
			}
			if (dmc == 38) {
				this.consumo = 190;
			}
		}
		
		return this.consumo;

	}

}
