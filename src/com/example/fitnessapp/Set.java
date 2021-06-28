package com.example.fitnessapp;

public class Set {
    int repetitions;
    double weight;
    WeightUnit weightUnit;

    public Set(int repetitions, double weight, WeightUnit weightUnit) {
        this.repetitions = repetitions;
        this.weight = weight;
        this.weightUnit = weightUnit;
    }

    public void printSet(){
        System.out.println(repetitions + " Repetitions at " + weight + " " + weightUnit.getStringRepresentation());
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }
}


