package cl.forge.programatufuturo.reservaprueba.services;

import cl.forge.programatufuturo.reservaprueba.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    private RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository){
        this.rolRepository=rolRepository;
    }
}
