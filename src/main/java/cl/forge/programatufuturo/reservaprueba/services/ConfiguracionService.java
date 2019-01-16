package cl.forge.programatufuturo.reservaprueba.services;

import cl.forge.programatufuturo.reservaprueba.repository.ConfiguracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfiguracionService {

    private ConfiguracionRepository configuracionRepository;

    @Autowired
    public ConfiguracionService(ConfiguracionRepository configuracionRepository){
        this.configuracionRepository=configuracionRepository;
    }
}
