package com.dojo.iv.calculadordeimposto.factory;

import com.dojo.iv.calculadordeimposto.CalculadorDeImpostoCaminhao;
import com.dojo.iv.calculadordeimposto.CalculadorDeImpostoCarro;
import com.dojo.iv.calculadordeimposto.CalculadorDeImpostoMoto;
import com.dojo.iv.calculadordeimposto.CalculadorDeImpostoOnibus;
import com.dojo.iv.calculadordeimposto.CalculadorDeImpostoPorAliquota;
import com.dojo.iv.entity.VeiculoEntity;

public class CalculadorDeImpostoFactory {

	private CalculadorDeImpostoFactory() {
		System.out.println("factory class");
	}

	public static CalculadorDeImpostoPorAliquota getCalculador(final VeiculoEntity veiculo) {

		switch (veiculo.getTipoVeiculo()) {
			case "carro":
				return new CalculadorDeImpostoCarro(veiculo.getValor());

			case "moto":

				return new CalculadorDeImpostoMoto(veiculo.getValor());

			case "onibus":

				return new CalculadorDeImpostoOnibus(veiculo.getValor());

			case "caminhao":

				return new CalculadorDeImpostoCaminhao(veiculo.getValor(), veiculo.getQuantidadeRodas());
			default:
				break;
		}

		return null;
	}

}
