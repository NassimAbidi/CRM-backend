package com.example.CRM.backend.Controller;


import com.example.CRM.backend.entities.Contact;
import com.example.CRM.backend.repository.ContactRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {


    private ContactRepo contactRepo;

    @GetMapping(path = "/allcontacts")
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }

    @GetMapping(path = "/contact/{id}")
    public Contact getContactById(@PathVariable  String id) {
        return contactRepo.findById(id).get();
    }



}
