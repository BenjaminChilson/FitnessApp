package com.example.fitnessapp;

import java.io.Serializable;
import java.util.ArrayList;

public class Exercise implements Serializable {
    String name;
    ArrayList<ExerciseLog> exerciseLogs;

    public Exercise(String name, int imageResourceID) {
        this.name = name;
        exerciseLogs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addExerciseLog(int sets, int reps, double weight){
        exerciseLogs.add(new ExerciseLog(sets, reps, weight));
    }

    public ArrayList<ExerciseLog> getExerciseLogs() {
        return exerciseLogs;
    }
}
