package com.example.CRM.backend.repository;

import com.example.CRM.backend.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportuniteRepo extends JpaRepository<Entreprise,String> {


}
