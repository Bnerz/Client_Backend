package com.desafio1.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio1.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
