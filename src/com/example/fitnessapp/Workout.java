package com.example.fitnessapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Workout implements Serializable {

    private String name;
    private ArrayList<Exercise> exerciseList;

    public Workout(String name) {
        this.name = name;
        this.exerciseList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void addExercise(Exercise exercise){
        exerciseList.add(exercise);
    }
    public void addExercises(Exercise ...exercises){
        exerciseList.addAll(Arrays.asList(exercises));
    }

    public void printWorkout(){
        System.out.println("Workout: " + name);
        System.out.println("\tExercises:");
        for(Exercise e : exerciseList){
            System.out.print("\t\t");
            e.printExercise();

        }
    }
}
