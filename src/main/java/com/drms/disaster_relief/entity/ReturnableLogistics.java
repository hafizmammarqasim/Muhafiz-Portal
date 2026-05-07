package com.drms.disaster_relief.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class ReturnableLogistics extends Logistics {
    @Id
    @GeneratedValue
    private String uniqueIdentifier;

    private String condition;

    private String model;

    private int year;
}