package com.example.CRM.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor  @Getter @Setter @ToString @Builder
public class Entreprise {

    @Id
    private String Id_Entreprise;

    private String Raison_Sociale_Entreprise;

    private String logo_Entreprise;

    private String SecteurActivite_Entreprise;

    private String Adresse_Entreprise;

    private String PointsGPS_Entreprise;

    private String SiteWeb_Entreprise;

    private String MatriculeFiscal_Entreprise;

    //Contact
    //Opportunite
    //interaction

    private String Statut_Entreprise;

    private String Prospection_Entreprise;

    private String Note_Entreprise;




}
