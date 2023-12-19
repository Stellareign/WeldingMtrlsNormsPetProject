package com.example.wedingnorms.model;

import jakarta.persistence.*;
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
    private int id;

    @Column(name = "Шов", nullable = false)
    private String seamName;

    @Column(name = "толщина_1,_мм", nullable = false)
    private int thick1;

    @Column(name = "толщина_2,_мм", nullable = false)
    private int thick2;

    @Column(name = "Расход,_кг/м", nullable = false)
    private int metalFlowRate;

    @Override
    public String toString() {
        return "Расход св. проволоки на шов " +
                " s" + thick1 +
                "/S" + thick2 +
                " = " + metalFlowRate + "kg";
    }

}
