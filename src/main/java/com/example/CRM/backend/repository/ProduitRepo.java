package com.example.CRM.backend.repository;

import com.example.CRM.backend.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit, String> {


}
