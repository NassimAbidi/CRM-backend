package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Interaction {

    @Id
    private String Id_Interaction;

    private String Type_Interaction;

    //Contact
    //Entreprise

    private String Opportunity_Associe;

    //produit

    private String Note_Interaction;
}
