package com.example.CRM.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Unsigned;
import lombok.*;

import java.util.Date;


@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
@Builder
public class Planning {

    @Id
    private String Id_Planning;

    private String statut;

    private Date Date;

    //Entreprise
    //Contact

    private Date DateRDV;

    private String SujetRDV;

    private String Adresse;

    private String Note_Planning;

}
