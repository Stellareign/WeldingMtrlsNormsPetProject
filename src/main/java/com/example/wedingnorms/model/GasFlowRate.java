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
public class GasFlowRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String seamName;

    private int think1;

    private int think2;

    private int gasFlowRate;

    @Override
    public String toString() {
        return "Расход газа на шов " +
                " s" + think1 +
                "/S" + think2 +
                " = " + gasFlowRate + " баллонов";
    }
}
