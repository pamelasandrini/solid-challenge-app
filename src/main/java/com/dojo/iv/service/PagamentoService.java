package com.dojo.iv.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

	public String pagar() {
		return UUID.randomUUID().toString();
	}

}
