package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Confrere {

    @Id
    private String Id_Confrere;

    private String Raison_Sociale_Confrere;

    //Entreprise

    private String Produits_Proposer;

    private String Marque;

    private Double PrixDeVente;

    private String Note_Confrere;

}
