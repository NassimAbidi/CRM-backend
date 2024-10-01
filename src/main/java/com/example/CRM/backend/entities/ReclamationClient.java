package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString @Builder
public class ReclamationClient {

    @Id
    private String Id_Reclamation;

    // Raison sociale de l'entreprise

    private String Contact;

    private String Produits;

    private String Services;

    private String images; //image

    private String Note_Reclamation;

}
