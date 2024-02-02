package models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Alumno {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAlumno;


    @Column
    private String primerNombre;

    @Column
    private String nombrePosteriores;

    @Column
    private String primerApellido;

    @Column
     private String segundoApellido;

    @Column
     private int edad;

    @Column
     private float nota;

     //Getters y setters

    public long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getNombrePosteriores() {
        return nombrePosteriores;
    }

    public void setNombrePosteriores(String nombrePosteriores) {
        this.nombrePosteriores = nombrePosteriores;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    
     


}
