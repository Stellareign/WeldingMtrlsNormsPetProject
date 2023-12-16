package com.example.wedingnorms.enums;

import lombok.Data;


public enum WeldingPosition {
    PA ("Н1"), // нижнее в стык или в лодочку
    PB ("Н2"), // нижнее в угол
    PC ("Г"), // горизонтальное
    PE ("П1"), // потолочное стык
    PD ("П2"), // потолочное в угол
    PF ("В1"), // вертикальное, снизу вверх
    PG ("В2"); // вертикальное, сверху вниз

    private String positionName;

    WeldingPosition(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }

    @Override
    public String toString() {
        return "Положение при сварке " + positionName;
    }
}
