package com.shreyas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shreyas.dto.AltaregionDTO;
import com.shreyas.service.AltaregionServiceImpl;

@RestController
public class AltaregionController {
	
	@Autowired
	private AltaregionServiceImpl altaregionServiceImpl;
	
	@PostMapping("/addAltaregion")
	public ResponseEntity<AltaregionDTO> addAltaregion(@RequestBody AltaregionDTO altaregionDTO){
		AltaregionDTO savedAltaregionDTO = altaregionServiceImpl.addAltaregion(altaregionDTO);
		return new ResponseEntity<>(savedAltaregionDTO, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAltaregion/{name}")
	public ResponseEntity<AltaregionDTO> getAltaregionByName(@PathVariable("name") String name){
		AltaregionDTO altaregionDTO = altaregionServiceImpl.getAltaregionByName(name);
		return new ResponseEntity<>(altaregionDTO,HttpStatus.OK);
	}
}
