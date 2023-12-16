package com.example.wedingnorms.model;

import com.example.wedingnorms.enums.SeamsGOSTs;
import com.example.wedingnorms.enums.SeamsNumber;
import com.example.wedingnorms.enums.WeldingPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WeldingSeam {
    @Id
    private int id;

    @Column(name = "ГОСТ", nullable = false)
    @Enumerated(EnumType.STRING) // для сохранения названия, а не цифры
    private SeamsGOSTs gost;

    @Column(name = "Тип шва", nullable = false)
    private SeamsNumber seamType;

    @Column(name = "Положение", nullable = false)
    @Enumerated(EnumType.STRING) // для сохранения названия, а не цифры
    private WeldingPosition position;

    @Column(name = "Толщина деталей, мм", nullable = false)
    private int think;

    @Column(name = "Длина шва, мм", nullable = false)
    private int seamLength;

    @Column(name = "Расход пров., кг", nullable = false)
    private int materialConsumption;

    public WeldingSeam(SeamsGOSTs gost, SeamsNumber seamType, int think) {
        this.seamType = seamType;
        this.gost = gost;
        this.think = think;
    }
}
