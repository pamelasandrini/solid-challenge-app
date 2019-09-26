package com.dojo.iv.calculadordeimposto;

import java.math.BigDecimal;

public class CalculadorDeImpostoMoto extends CalculadorDeImpostoPorAliquota {

	private static final double ALIQUOTA = 0.03;
	private final BigDecimal valor;

	public CalculadorDeImpostoMoto(final BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public BigDecimal calcula() {
		return calculaImpostoPorAliquota(valor, ALIQUOTA);
	}

	@Override
	protected BigDecimal calculaImpostoPorAliquota(final BigDecimal valor, final double aliquota) {
		return valor.multiply(BigDecimal.valueOf(aliquota));
	}

}
