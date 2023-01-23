package com.unir.grupo12backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductsController {

    @RequestMapping(value="jose")
    public String test(String name) {
        return name;
    }
}
