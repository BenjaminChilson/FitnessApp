package com.example.fitnessapp;

public class ExerciseLog {
    private int sets;
    private int reps;
    private double weight;

    public ExerciseLog(int sets, int reps, double weight) {
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
