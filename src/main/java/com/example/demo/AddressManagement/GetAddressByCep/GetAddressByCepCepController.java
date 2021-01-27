package com.example.demo.AddressManagement.GetAddressByCep;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequestMapping("cep")
@RestController
@RequiredArgsConstructor
public class GetAddressByCepCepController {
	
	@Autowired
	private GetAddressByCepService addressServiceService;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@RequestMapping("/getAddressByCep/{cep}")
	public ResponseEntity<AddressDTO> getCep(@PathVariable String cep){
		AddressDTO addressDTO = modelMapper.map(addressServiceService.getAddressByCep(cep),AddressDTO.class);
		return ResponseEntity.ok(addressDTO);
	}

}
