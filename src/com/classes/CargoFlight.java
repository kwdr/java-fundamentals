package com.classes;

public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public void add1Package(float h, float w, float d) {
        double size = h * w * d;
        if (hasCargoSpace(size)) {
            usedCargoSpace += size;
        } else {
            handleNoSpace();
        }
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }

    private boolean hasCargoSpace(double size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }


}
