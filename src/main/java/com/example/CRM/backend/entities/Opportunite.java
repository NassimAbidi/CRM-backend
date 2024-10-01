package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor  @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Opportunite {

    @Id
    private String Id_opportunite;

    private String Titre_opportunite;

    private String Description_opportunite;

    private String ContactPrincipal;

    //entreprise
    //Produit

    private Double Valeur_produit;

    private Double ValeurAchat_produit;

    private String statu;//CHANGER

    private Date DateCloture;

    private String Confrere;

    private String DevisAcquis; //image

    private String Rappel;

}
