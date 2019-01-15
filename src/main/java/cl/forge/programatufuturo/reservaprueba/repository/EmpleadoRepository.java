package cl.forge.programatufuturo.reservaprueba.repository;

import cl.forge.programatufuturo.reservaprueba.models.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado,String> {
}
