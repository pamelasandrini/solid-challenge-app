package com.dojo.iv.calculadordeimposto;

import java.math.BigDecimal;

public abstract class CalculadorDeImpostoPorAliquota implements CalculadorDeImposto {

	protected abstract BigDecimal calculaImpostoPorAliquota(BigDecimal valor, double aliquota);

}
