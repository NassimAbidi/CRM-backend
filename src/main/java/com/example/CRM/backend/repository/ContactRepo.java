package com.example.CRM.backend.repository;

import com.example.CRM.backend.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepo extends JpaRepository<Contact,String> {

    List<Contact> findByContactName(String Nom_Contact);

    List<Contact> findByContactId(String id);



}
