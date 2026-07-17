package com.tenpearls.contact_manager.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String phoneNumber;
    private String label; // Example: Home, Work, Mobile

    // OOPs: Many Phone numbers belong to One Contact
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;
}