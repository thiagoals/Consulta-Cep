package com.example.demo.CepManagement.GetCep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cepService", url="https://viacep.com.br/ws", value="cepService")
public interface CepService {
	
	@GetMapping("/{cep}/json/")
	ResponseEntity<CepResponse> getCep(@PathVariable("cep") String cep);
}