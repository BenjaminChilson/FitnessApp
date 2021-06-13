package com.example.fitnessapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Exercise implements Serializable {
    String name;
    ArrayList<Integer> regimentSet;
    ArrayList<Set> sets;
    ArrayList<ExerciseLog> exerciseLogs;

    public Exercise(String name) {
        this.name = name;
        sets = new ArrayList<>();
        exerciseLogs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addExerciseLog(int sets, int reps, double weight){
        exerciseLogs.add(new ExerciseLog(sets, reps, weight));
    }

    public void addSet(Set set){
        sets.add(set);
    }

    public ArrayList<ExerciseLog> getExerciseLogs() {
        return exerciseLogs;
    }

    public void printExercise() {
        System.out.println(name);
        for(Set s : sets){
            System.out.print("\t\t\t");
            s.printSet();
        }
    }
}
