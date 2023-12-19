package com.example.wedingnorms.model;

import com.example.wedingnorms.enums.SeamsGOSTs;
import com.example.wedingnorms.enums.SeamsNumber;
import com.example.wedingnorms.enums.WeldingPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WeldingSeam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ГОСТ", nullable = false)
    @Enumerated(EnumType.STRING) // для сохранения в базе названия, а не цифры
    private SeamsGOSTs gost;

    @Column(name = "Тип_шва", nullable = false)
    private SeamsNumber seamType;

    @Column(name = "Положение")
    @Enumerated(EnumType.STRING) // для сохранения названия, а не цифры
    private WeldingPosition position;

    @Column(name = "Ссылка_на_эскиз")
    private String sketchLink;

    @OneToOne
    private ElectrodeFlowRate electrodeFlowRate;

    @OneToOne
    private MetalFlowRate metalFlowRate;

    @OneToOne
    private GasFlowRate gasFlowRate;

    @OneToOne
    private FluxFlowRate fluxFlowRate;

    @OneToMany
    private List<MetalFlowRate> flowRate;


    public WeldingSeam(SeamsGOSTs gost, SeamsNumber seamType) {
        this.seamType = seamType;
        this.gost = gost;
    }

}
