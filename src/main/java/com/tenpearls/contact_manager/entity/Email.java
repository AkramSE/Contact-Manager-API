package com.tenpearls.contact_manager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String emailAddress;

    private String label; // Example: "Work", "Personal"

    // OOPs: Many Emails belong to One Contact
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;
}