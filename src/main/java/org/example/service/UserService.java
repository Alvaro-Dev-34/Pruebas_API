package org.example.service;

import org.example.model.Persona;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

     @Autowired
    private UserRepository userRepository;

     public List<Persona> getAllPersonas(){
         System.out.println("INIT getAllPersonas");
         return userRepository.findAll();
     }
    public Persona getPersonaById(Long id){
        System.out.println("INIT getPersonasBtId");
        Optional<Persona> persona = userRepository.findById(id);
        return persona.get();
    }
    public Persona postPersona(Persona persona){
        System.out.println("INIT postPersona");
        return userRepository.save(persona);
    }

    public void deletePersona(Persona persona){
        System.out.println("INIT deletePersona");
        userRepository.delete(persona);
    }

    public void pruebaBoolean(){
        boolean operador = true;
        int num = 0;
        String o = operador ? "true": "false"; //esta linea es un if

        o = num == 1 ? "true": "false"; //esta linea es un if

    }

}
