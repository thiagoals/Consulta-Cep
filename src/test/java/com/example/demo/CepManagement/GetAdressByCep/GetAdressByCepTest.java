package com.example.demo.CepManagement.GetAdressByCep;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.AddressManagement.GetAddressByCep.AddressDTO;
import com.example.demo.AddressManagement.GetAddressByCep.GetAddressByCepCepController;

@SpringBootTest
class GetAdressByCepTest{
	
	@Autowired
	private GetAddressByCepCepController getAddressByCepCepController;
	
	@BeforeAll
	static void logTest() {
		System.out.println("Executing GetAddressByCep Test Case");
	}
	
	@SuppressWarnings("unchecked")
	@Test
	void getAddressByCep() {
		ResponseEntity<?> responseEntity = getAddressByCepCepController.getCep("65071383");
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertEquals(((ResponseEntity<AddressDTO>) responseEntity).getBody().getLogradouro(),"Avenida Neiva Moreira");
	}
}
