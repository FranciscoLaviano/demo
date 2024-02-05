package models;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//import org.hibernate.mapping.PrimaryKey;
import  java.lang.String;

//@Entity;





@Setter
@Getter
public  class Clients {

    //@Entity
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Name;

    private String overNames;
    private String firstSurname;
    private String secondSurname;
    private String mail;

    public long getId() {

        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOverNames() {
        return overNames;
    }

    public void setOverNames(String overNames) {
        this.overNames = overNames;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


}