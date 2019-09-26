package com.dojo.iv.calculadordeimposto;

import java.math.BigDecimal;

public class CalculadorDeImpostoOnibus extends CalculadorDeImpostoPorAliquota {

	private static final double ALIQUOTA = 0.8;
	private final BigDecimal valor;

	public CalculadorDeImpostoOnibus(final BigDecimal valor) {
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
