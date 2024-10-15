package org.example.repository;

import org.example.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Persona, Long> {

}
