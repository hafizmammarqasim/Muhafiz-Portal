package com.drms.disaster_relief.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID userId;

    private String firstName;

    private String lastName;

    private String cnic;

    private String phoneNumber;

    private String email;

    private String city;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}