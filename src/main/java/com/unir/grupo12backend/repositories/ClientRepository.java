package com.unir.grupo12backend.repositories;

import com.unir.grupo12backend.models.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, Long> {
    public abstract ArrayList<ClientModel> findByEmail (String email);
    public abstract ArrayList<ClientModel> findByFirstName (String firstName);
}
