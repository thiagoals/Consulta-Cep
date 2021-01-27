package com.example.demo.CepManagement.GetCep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequestMapping("cep")
@RestController
@RequiredArgsConstructor
public class GetCepController {
	
	private final CepService cepService;
	
	
	@RequestMapping("/getCep/{cep}")
	public ResponseEntity<?> getCep(@PathVariable String cep){
		return cepService.getAddressByCep(cep);
	}

}
