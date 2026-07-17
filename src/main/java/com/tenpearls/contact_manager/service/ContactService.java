package com.tenpearls.contact_manager.service;

import com.tenpearls.contact_manager.entity.Contact;
import com.tenpearls.contact_manager.entity.User;
import com.tenpearls.contact_manager.repository.ContactRepository;
import com.tenpearls.contact_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private UserRepository userRepository;

    public Contact addContact(Long userId, Contact contact) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        contact.setUser(user); // Contact ko user ke sath jor diya
        return contactRepository.save(contact);
    }

    public List<Contact> getContactsByUserId(Long userId) {
        return contactRepository.findByUserId(userId);
    }
    public void deleteContact(Long contactId) {
        contactRepository.deleteById(contactId);
    }

    public Contact updateContact(Long contactId, Contact contactDetails) {
        Contact existingContact = contactRepository.findById(contactId)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + contactId));

        existingContact.setFirstName(contactDetails.getFirstName());
        existingContact.setLastName(contactDetails.getLastName());
        existingContact.setTitle(contactDetails.getTitle());

        // New data database mein save kar dein
        return contactRepository.save(existingContact);
    }
}