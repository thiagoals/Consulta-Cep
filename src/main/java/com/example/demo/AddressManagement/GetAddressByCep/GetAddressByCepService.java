package com.example.demo.AddressManagement.GetAddressByCep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cepService", url="https://viacep.com.br/ws", value="cepService")
public interface GetAddressByCepService {
	
	@GetMapping("/{cep}/json/")
	Address getAddressByCep(@PathVariable("cep") String cep);
}