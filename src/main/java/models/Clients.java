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
    private Long Id;
    @Setter
    @Getter
    private String Name;

    @Getter
    @Setter
    private String overNames;
    @Setter
    @Getter
    private String firstSurname;
    @Setter
    @Getter
    private String secondSurname;
    @Setter
    @Getter
    private String mail;

    public long getId() {

        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }


}