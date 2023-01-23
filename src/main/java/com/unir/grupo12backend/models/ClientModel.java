package com.unir.grupo12backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Clientes")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Getter @Setter
    private String FirstName;
    @Getter @Setter
    private String LastName;
    @Getter @Setter
    private String Email;
    @Getter @Setter
    private String Phone;
    @Getter @Setter
    private String Password;




}
