package com.example.fitnessapp;

public enum WeightUnit {
    POUNDS, KILOGRAMS;

    public String getStringRepresentation() {
        switch (this) {
            case POUNDS:
                return "pounds";
            case KILOGRAMS:
                return "kilograms";
            default:
                return "weight measurement could not be found";
        }
    }
}
