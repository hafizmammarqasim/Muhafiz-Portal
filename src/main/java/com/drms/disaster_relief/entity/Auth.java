package com.drms.disaster_relief.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Auth {
    @Id
    @GeneratedValue
    private UUID authId;

    private String loginIdentifier;

    private String password;

    private String role;

    private String entityType;

    private UUID entityId;

    private boolean isActive;

    private LocalDateTime lastLoginAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}