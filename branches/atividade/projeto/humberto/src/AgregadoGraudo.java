
public class AgregadoGraudo {
	
	Double dmc;
	Double massaUnitaria;
	Double pesoEspecifico;
	Double consumo;
	
	public Double calcularConsumoAgregadoGraudo(Double dmc, Double mf) {
		Double volume = null;
		if (mf == 1.8) {
			if (dmc == 9.5) {
				volume = 0.645;
			}
			if (dmc == 19) {
				volume = 0.770;
			}
			if (dmc == 25) {
				volume = 0.795;
			}
			if (dmc == 32) {
				volume = 0.820;
			}
			if (dmc == 38) {
				volume = 0.845;
			}
		}
		if (mf == 2.0) {
			if (dmc == 9.5) {
				volume = 0.625;
			}
			if (dmc == 19) {
				volume = 0.750;
			}
			if (dmc == 25) {
				volume = 0.775;
			}
			if (dmc == 32) {
				volume = 0.800;
			}
			if (dmc == 38) {
				volume = 0.825;
			}
		}
		if (mf == 2.2) {
			if (dmc == 9.5) {
				volume = 0.605;
			}
			if (dmc == 19) {
				volume = 0.730;
			}
			if (dmc == 25) {
				volume = 0.755;
			}
			if (dmc == 32) {
				volume = 0.780;
			}
			if (dmc == 38) {
				volume = 0.805;
			}
		}
		if (mf == 2.4) {
			if (dmc == 9.5) {
				volume = 0.585;
			}
			if (dmc == 19) {
				volume = 0.710;
			}
			if (dmc == 25) {
				volume = 0.735;
			}
			if (dmc == 32) {
				volume = 0.760;
			}
			if (dmc == 38) {
				volume = 0.785;
			}
		}
		if (mf == 2.6) {
			if (dmc == 9.5) {
				volume = 0.565;
			}
			if (dmc == 19) {
				volume = 0.690;
			}
			if (dmc == 25) {
				volume = 0.715;
			}
			if (dmc == 32) {
				volume = 0.740;
			}
			if (dmc == 38) {
				volume = 0.765;
			}
		}
		if (mf == 2.8) {
			if (dmc == 9.5) {
				volume = 0.545;
			}
			if (dmc == 19) {
				volume = 0.670;
			}
			if (dmc == 25) {
				volume = 0.695;
			}
			if (dmc == 32) {
				volume = 0.720;
			}
			if (dmc == 38) {
				volume = 0.745;
			}
		}
		if (mf == 3.0) {
			if (dmc == 9.5) {
				volume = 0.525;
			}
			if (dmc == 19) {
				volume = 0.650;
			}
			if (dmc == 25) {
				volume = 0.675;
			}
			if (dmc == 32) {
				volume = 0.700;
			}
			if (dmc == 38) {
				volume = 0.725;
			}
		}
		if (mf == 3.2) {
			if (dmc == 9.5) {
				volume = 0.505;
			}
			if (dmc == 19) {
				volume = 0.630;
			}
			if (dmc == 25) {
				volume = 0.655;
			}
			if (dmc == 32) {
				volume = 0.680;
			}
			if (dmc == 38) {
				volume = 0.705;
			}
		}
		if (mf == 3.4) {
			if (dmc == 9.5) {
				volume = 0.485;
			}
			if (dmc == 19) {
				volume = 0.610;
			}
			if (dmc == 25) {
				volume = 0.635;
			}
			if (dmc == 32) {
				volume = 0.660;
			}
			if (dmc == 38) {
				volume = 0.685;
			}
		}
		if (mf == 3.6) {
			if (dmc == 9.5) {
				volume = 0.465;
			}
			if (dmc == 19) {
				volume = 0.590;
			}
			if (dmc == 25) {
				volume = 0.615;
			}
			if (dmc == 32) {
				volume = 0.640;
			}
			if (dmc == 38) {
				volume = 0.665;
			}
		}			
		
		this.consumo = volume * this.massaUnitaria;
		return this.consumo;
	}
}
	
