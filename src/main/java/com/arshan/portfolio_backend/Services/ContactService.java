package com.arshan.portfolio_backend.Services;

import com.arshan.portfolio_backend.DTO.ContactRequestDTO;
import com.arshan.portfolio_backend.DTO.ContactResponseDTO;
import com.arshan.portfolio_backend.Entity.Contacts;
import com.arshan.portfolio_backend.Repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactResponseDTO createdContact(ContactRequestDTO contactRequestDTO) {
        Contacts contact = mapToEntity(contactRequestDTO);
        contactRepository.save(contact);
        ContactResponseDTO contactResponseDTO =new ContactResponseDTO("Success! Your form has been submitted. Thank you for reaching out, we will be in touch shortly.");
        return contactResponseDTO;
    }

    private Contacts mapToEntity(ContactRequestDTO contactRequestDTO) {
        Contacts contacts = new Contacts();
        contacts.setName(contactRequestDTO.getName());
        contacts.setEmail(contactRequestDTO.getEmail());
        contacts.setPhone(contactRequestDTO.getPhone());
        contacts.setSubject(contactRequestDTO.getSubject());
        contacts.setMessage(contactRequestDTO.getMessage());
        contacts.getLocalDateTime();
        return contacts;
    }



}
