package com.dojo.iv.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.iv.entity.VeiculoEntity;
import com.dojo.iv.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoService service;

	@GetMapping(value = "/list")
	public List<VeiculoEntity> getVeiculos() {

		return service.getAllVeiculos();

	}

	@GetMapping(value = "/calculaImposto")
	public BigDecimal calculaImposto(@RequestParam(name = "codigoVeiculo") final String codigoVeiculo) {

		System.out.println("calling /veiculo/calculaImposto");

		return service.getImpostoCalculado(codigoVeiculo);

	}
}
