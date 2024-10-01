package com.example.CRM.backend.repository;

import com.example.CRM.backend.entities.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepo extends JpaRepository<Interaction, String> {


}
