package models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.Setter;
import org.hibernate.mapping.PrimaryKey;
import  java.lang.String;

@Entity
//@Column

/*@GenerationType
@PrimaryKey*/



public  class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private long idCliente;
    @Setter
    private String Nombre;

    @Setter
    private String nombresPosteriores;
    @Setter
    private String primerApellido;
    @Setter
    private String segundoApellido;
    @Setter
    private String mail;


    public long getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNombresPosteriores() {
        return nombresPosteriores;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }


    public String getMail() {
        return mail;
    }

}