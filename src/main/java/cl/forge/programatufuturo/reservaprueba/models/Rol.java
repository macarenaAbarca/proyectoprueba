package cl.forge.programatufuturo.reservaprueba.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {

    @Id
    @Column(name="id_rol")
    private Integer id_rol;

    @Column(name="nombre")
    private String nombre;

    public Rol(){
    }

    public Rol(Integer id_rol, String nombre) {
        this.id_rol = id_rol;
        this.nombre = nombre;
    }

    //ToString
    @Override
    public String toString() {
        return "Rol{" +
                "id_rol=" + id_rol +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Getter and Setters
    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
