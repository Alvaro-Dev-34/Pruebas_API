package org.example.controller;

import org.example.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//@RestController()
@RestController
@RequestMapping
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/pizza200")
    public ResponseEntity<byte[]> pizza200() {
        System.out.println("INIT pizza200");

        String url = "https://status.pizza/200";
        ResponseEntity<byte[]> response = restTemplate.getForEntity(url, byte[].class);

        System.out.println("FIN pizza200");
        return response;
    }


    @PostMapping("/pizza")
    public ResponseEntity<byte[]> pizza(@RequestBody Pizza pizza) {
        System.out.println("INIT pizza");

        String url = pizza.getUrl();
        ResponseEntity<byte[]> response = restTemplate.getForEntity(url, byte[].class);

        System.out.println("FIN pizza");
        return response;
    }


    public void pruebaBoolean(){
        boolean operador = true;
        int num = 0;
        String o = operador ? "true": "false"; //esta linea es un if

        o = num == 1 ? "true": "false"; //esta linea es un if

    }
}


