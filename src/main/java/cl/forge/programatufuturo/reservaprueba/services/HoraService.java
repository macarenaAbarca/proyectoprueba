package cl.forge.programatufuturo.reservaprueba.services;

import cl.forge.programatufuturo.reservaprueba.repository.HoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoraService {

    private HoraRepository horaRepository;

    @Autowired
    public HoraService(HoraRepository horaRepository){
        this.horaRepository=horaRepository;
    }
}
