package project.springproject.reto5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.springproject.reto5.model.Cliente;
import project.springproject.reto5.repository.ClienteRepository;


import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;
    @GetMapping("/id/{id}")
    public ResponseEntity<Cliente> getByISBN(@PathVariable Long id){

    }
}
