package cl.forge.programatufuturo.reservaprueba.controllers;


import cl.forge.programatufuturo.reservaprueba.repository.ClienteRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteRepository repository;


}
