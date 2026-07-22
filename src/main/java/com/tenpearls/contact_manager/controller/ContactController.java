package com.tenpearls.contact_manager.controller;

import com.tenpearls.contact_manager.dto.ContactDTO;
import com.tenpearls.contact_manager.entity.Contact;
import com.tenpearls.contact_manager.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"}) // <--- Yeh nayi line yahan add karni hai
@RequestMapping("/users/{userId}/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping
    public Contact createContact(@PathVariable Long userId, @Valid @RequestBody Contact contact) {
        return contactService.addContact(userId, contact);
    }

    @GetMapping
    public List<ContactDTO> getAllContacts(@PathVariable Long userId) {
        return contactService.getContactsByUserId(userId).stream().map(contact -> {
            ContactDTO dto = new ContactDTO();
            dto.setId(contact.getId());
            dto.setFirstName(contact.getFirstName());
            dto.setLastName(contact.getLastName());
            dto.setTitle(contact.getTitle());
            dto.setEmails(contact.getEmails());
            dto.setPhones(contact.getPhones());
            return dto;
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{contactId}")
    public String deleteContact(@PathVariable Long userId, @PathVariable Long contactId) {
        contactService.deleteContact(contactId);
        return "Contact ID " + contactId + " has been successfully deleted!";
    }

    @PutMapping("/{contactId}")
    public Contact updateContact(@PathVariable Long userId, @PathVariable Long contactId, @Valid @RequestBody Contact contactDetails) {
        return contactService.updateContact(contactId, contactDetails);
    }
}