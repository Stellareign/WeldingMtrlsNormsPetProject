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
public class ElectrodeFlowRate {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private int think1;

    private int think2;

    private int electrodeFlowRate;

    @Override
    public String toString() {
        return "Расход электродов на шов " +
                " s" + think1 +
                "/S" + think2 +
                " = " + electrodeFlowRate + "kg";
    }
}
