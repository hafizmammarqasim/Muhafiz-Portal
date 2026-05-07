package com.drms.disaster_relief.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Logistics {
    @Id
    @GeneratedValue
    private UUID logisticsId;

    @ManyToOne
    @JoinColumn(name="branchId")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee addedBy;

    private String type;

    private String name;

    private String category;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}