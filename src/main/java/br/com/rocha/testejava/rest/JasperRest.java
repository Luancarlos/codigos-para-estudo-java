package br.com.rocha.testejava.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasperRest {

    @GetMapping("")
    public String  teste() {
        return "Funcionou";
    }
}
