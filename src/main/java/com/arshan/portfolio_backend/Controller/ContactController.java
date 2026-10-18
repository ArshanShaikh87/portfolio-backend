package com.arshan.portfolio_backend.Controller;

import com.arshan.portfolio_backend.DTO.ContactRequestDTO;
import com.arshan.portfolio_backend.DTO.ContactResponseDTO;
import com.arshan.portfolio_backend.Services.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/contact")
//@CrossOrigin(origins = "http://localhost:5173")
@CrossOrigin(origins = "${app.frontend-url}")
public class ContactController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<ContactResponseDTO> createdContact(@Valid @RequestBody ContactRequestDTO request) {
        ContactResponseDTO response = contactService.createdContact(request);
        return ResponseEntity.ok(response);
    }

}
