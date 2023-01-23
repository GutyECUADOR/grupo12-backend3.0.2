package com.unir.grupo12backend.controllers;

import com.unir.grupo12backend.models.ClientModel;
import com.unir.grupo12backend.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClientsController {
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClientModel> getClients(){
        return this.clienteService.getClientes();
    }

    @PostMapping
    public ClientModel createClient(@RequestBody ClientModel client){
        return this.clienteService.saveCliente(client);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientModel> getClinteByID(@PathVariable("id") Long id) {
        return this.clienteService.findByID(id);
    }


}
