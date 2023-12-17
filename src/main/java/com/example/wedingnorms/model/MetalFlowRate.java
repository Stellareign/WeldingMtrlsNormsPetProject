package com.example.wedingnorms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MetalFlowRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String seamName;
    int think;
    int flowRate;
}
