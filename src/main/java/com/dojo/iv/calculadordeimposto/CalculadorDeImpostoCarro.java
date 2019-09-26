package com.dojo.iv.calculadordeimposto;

import java.math.BigDecimal;

public class CalculadorDeImpostoCarro extends CalculadorDeImpostoPorAliquota {

	private final BigDecimal valor;
	private final double ALIQUOTA = 0.1;

	public CalculadorDeImpostoCarro(final BigDecimal valor) {
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
