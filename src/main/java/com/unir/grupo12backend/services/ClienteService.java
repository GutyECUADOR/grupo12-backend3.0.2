package com.unir.grupo12backend.services;

import ch.qos.logback.core.net.server.Client;
import com.unir.grupo12backend.models.ClientModel;
import com.unir.grupo12backend.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired //Inyeccion de dependencias
    ClientRepository clientRepository;

    public ArrayList<ClientModel> getClientes(){
        return (ArrayList<ClientModel>) this.clientRepository.findAll(); // Cast de iterable a ArrayList
    }

    public ClientModel saveCliente(ClientModel client){
        return this.clientRepository.save(client);
    }

    //Spring boot indica que debe ser optional ya que es un posible nulo
    public Optional <ClientModel> findByID(Long id){
        return this.clientRepository.findById(id);
    }
}
