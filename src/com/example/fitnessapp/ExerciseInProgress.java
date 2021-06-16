package com.example.fitnessapp;

import java.util.ArrayList;

public class ExerciseInProgress extends SetSeries{
    Exercise exercise;

    public ExerciseInProgress(Exercise exercise) {
        super();
        this.exercise = exercise;
    }

    public void addSet(int reps, double weight, WeightUnit weightUnit){
        sets.add(new Set(reps, weight, weightUnit));
    }

    public void addSet(Set set){
        sets.add(set);
    }

    public void logExercise(){
        exercise.addExerciseLog(sets);
    }
}
