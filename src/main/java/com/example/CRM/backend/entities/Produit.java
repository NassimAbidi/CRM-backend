package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Produit {

    @Id
    private String Id_produit;

    private String Famille_produit;

    private String Marque_produit;

    private String DesegnationProduit; //image

    private String Reference_produit;

    private Double Prix_produit;

    //prix achat liée table Opportunité
    //opportunité

    private String consommationAnnuelle;

    private String EnvironnementTravaille;

    //confrere

    private String Statut_produit;

}
