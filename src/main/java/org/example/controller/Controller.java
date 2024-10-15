package org.example.controller;

import org.example.model.Persona;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController()
@RestController
@RequestMapping
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String home() {
        System.out.println("INIT home");
        return "home.html";
    }

    @GetMapping("/prueba2")
    public String index2() {
        System.out.println("INIT index2");
        return "index2.html";
    }
    @PostMapping("/post")
    public Persona post(@RequestBody Persona persona) {
        System.out.println("INIT post");
        System.out.println("Persona: " + persona.getId() + ", " +persona.getNombre()+ ", " + persona.getEdad());

        try {
            Persona personaResponse = userService.postPersona(persona);
            System.out.println("FIN postPersona");

            return personaResponse;
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("FIN post");
        return null;
    }
    @GetMapping("/getAll")
    public List<Persona> getAll() {
        List<Persona> personaList = userService.getAllPersonas();
        return personaList;
    }
    @DeleteMapping("/delete") //Pendiente por terminar
    public String delete(String parametro) {
        return "String: DELETE";
    }
}


