package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Contact{

    @Id
    private String Id_contact;

    private String Nom_contact;

    private String Prenom_contact;

    private String Email_contact;

    private String Telephone_contact;

    private String Poste_contact;

    private String Services_contact;

    private String Note_Contact;

    //Entreprise
    //Opportunite


}
