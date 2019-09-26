package com.dojo.iv.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.iv.calculadordeimposto.CalculadorDeImposto;
import com.dojo.iv.calculadordeimposto.factory.CalculadorDeImpostoFactory;
import com.dojo.iv.entity.VeiculoEntity;
import com.dojo.iv.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;

	public BigDecimal getImpostoCalculado(final String codigoVeiculo) {

		final VeiculoEntity veiculo = getVeiculoByCodigo(codigoVeiculo);

		final CalculadorDeImposto calculador = CalculadorDeImpostoFactory.getCalculador(veiculo);

		return calculador.calcula();
	}

	private VeiculoEntity getVeiculoByCodigo(final String codigoVeiculo) {
		return repository.findById(codigoVeiculo).orElse(new VeiculoEntity());
	}

	public List<VeiculoEntity> getAllVeiculos() {

		return (List<VeiculoEntity>) repository.findAll();

	}
}
