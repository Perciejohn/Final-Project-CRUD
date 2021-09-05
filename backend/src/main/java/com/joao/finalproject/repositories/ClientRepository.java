package com.joao.finalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.finalproject.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
