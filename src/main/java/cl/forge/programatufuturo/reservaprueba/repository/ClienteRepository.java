package cl.forge.programatufuturo.reservaprueba.repository;

import cl.forge.programatufuturo.reservaprueba.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,String> {
}
