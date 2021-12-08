package com.desafio1.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio1.client.entities.Client;
import com.desafio1.client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
		
	}

}
