package com.arshan.portfolio_backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact_messages")
@Data
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String message;
    private LocalDateTime localDateTime = LocalDateTime.now();
}
