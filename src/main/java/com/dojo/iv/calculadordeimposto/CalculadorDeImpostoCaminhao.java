package com.dojo.iv.calculadordeimposto;

import java.math.BigDecimal;

public class CalculadorDeImpostoCaminhao extends CalculadorDeImpostoPorAliquota {

	private static final double ALIQUOTA = 0.7;
	private final BigDecimal valor;
	private final Integer quantidadeRodas;

	public CalculadorDeImpostoCaminhao(final BigDecimal valor, final Integer quantidadeRodas) {
		this.valor = valor;
		this.quantidadeRodas = quantidadeRodas;
	}

	@Override
	public BigDecimal calcula() {

		final double adicional = calculaAdicionalPorRoda();

		return calculaImpostoPorAliquota(valor, ALIQUOTA).add(BigDecimal.valueOf(adicional));
	}

	private double calculaAdicionalPorRoda() {
		return quantidadeRodas * 10;
	}

	@Override
	protected BigDecimal calculaImpostoPorAliquota(final BigDecimal valor, final double aliquota) {
		return valor.multiply(BigDecimal.valueOf(aliquota));
	}

}
