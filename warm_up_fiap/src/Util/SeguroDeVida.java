package Util;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public Double getValorImposto() {
		return 42.00;
	}

}
