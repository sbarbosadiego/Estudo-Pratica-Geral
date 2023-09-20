package com.matera.bootcampmatera.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Conta {

    private Long id;
    private String numeroConta;
    private String agencia;
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

    
}

