package com.example.demo.CepManagement.GetCep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="cepService", url="https://viacep.com.br/ws", value="cepService")
public interface CepService {
	@RequestMapping(value="/{cep}/json/", method = RequestMethod.GET)
	CepResponse getCep(@PathVariable("cep") String cep);
}
