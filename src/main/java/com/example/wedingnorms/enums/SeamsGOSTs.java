package com.example.wedingnorms.enums;

public enum SeamsGOSTs {
    G_14771("ГОСТ14771-76"),
    G_5264("ГОСТ 5264-80"),
    G_8713("ГОСТ 8713-79"),
    G_23518("ГОСТ 23518-79"),
    G_11533("ГОСТ 11533-75"),
    G_11534("ГОСТ 11534-75");
    private String gostName;

    SeamsGOSTs(String gostNumber) {
        this.gostName = gostNumber;
    }

    public String gostName() {
        return gostName;
    }

    @Override
    public String toString() {
        return  gostName;
    }
}
