package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceOfRepo;
import com.example.demo.entities.BillionarEntity;

import dto.BillionareCreateDto;

@RestController
public class Rests {
	
	@Autowired
	private ServiceOfRepo service;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<BillionarEntity>findById(@PathVariable Long id) throws Exception{
		return new ResponseEntity<BillionarEntity>(service.find(id),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void save(@RequestBody BillionareCreateDto dto ) throws Exception{
		service.save(dto);
	}
	@DeleteMapping("/delete")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@RequestParam long id) throws Exception {
		service.delete(id);
	}

}
