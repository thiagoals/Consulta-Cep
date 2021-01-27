package com.example.demo.CepManagement.GetCep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CepResponse {
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localicade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
}
