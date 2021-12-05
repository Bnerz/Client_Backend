package com.desafio1.client.resources;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio1.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
	List<Client> list = new ArrayList<>();
	list.add(new Client(1L, "Paulo", "123456789-53", 1000.00,Instant.parse("2021-07-14T00:00:00Z"), 2));
	return ResponseEntity.ok().body(list);
	
	
	}
	
}