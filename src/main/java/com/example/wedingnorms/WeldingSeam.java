package com.example.wedingnorms;

import com.example.wedingnorms.enums.SeamsGOSTs;
import com.example.wedingnorms.enums.SeamsType;
import com.example.wedingnorms.enums.WeldingPosition;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @Column(name = "Тип шва", nullable = false)
    private SeamsType seamType;

    @Column(name = "Номер шва", nullable = false)
    private String seamsNumber;

    @Column(name = "ГОСТ", nullable = false)
    private SeamsGOSTs gost;

    @Column(name = "Положение", nullable = false)
    private WeldingPosition position;

    @Column(name = "Толщина деталей, мм", nullable = false)
    private int think;

    @Column(name = "ТДлина шва, мм", nullable = false)
    private int seamLength;


}
