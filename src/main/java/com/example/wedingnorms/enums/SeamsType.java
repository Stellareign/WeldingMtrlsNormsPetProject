package com.example.wedingnorms.enums;

public enum SeamsType {
    C ("С"), // стыковой
    T ("Т"), // тавровый
    Y ("У"), // угловой
    N ("Н"); // нахлёсточный
    private String typeSeamsName;

    SeamsType(String typeSeamsName) {
        this.typeSeamsName = typeSeamsName;
    }

    public String typeSeamsName() {
        return typeSeamsName;
    }

    @Override
    public String toString() {
        return "Тип шва " + typeSeamsName;
    }
}
