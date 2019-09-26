package com.dojo.iv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.iv.service.PagamentoService;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private PagamentoService service;

	@GetMapping
	public String pagaImposto(@RequestParam(name = "codigoVeiculo") final String codigoVeiculo) {

		System.out.println("calling /pagamento");

		return service.pagar();

	}
}
