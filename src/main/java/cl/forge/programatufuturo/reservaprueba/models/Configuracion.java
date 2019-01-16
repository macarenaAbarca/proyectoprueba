package cl.forge.programatufuturo.reservaprueba.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configuracion")
public class Configuracion {

    @Id
    @Column(name = "llave")
    private String llave;

    @Column(name = "valor")
    private String valor;

    public Configuracion(){
    }

    public Configuracion(String llave, String valor) {
        this.llave = llave;
        this.valor = valor;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ConfiguracionRepository{" +
                "llave='" + llave + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

}
