package com.example.fitnessapp;

import java.util.ArrayList;

public class ExerciseLog extends SetSeries{

    ExerciseGoal exerciseGoal;

    public ExerciseLog(ArrayList<Set> sets, ExerciseGoal exerciseGoal) {
        super();
        this.sets = sets;
        this.exerciseGoal = exerciseGoal;
    }

    public void addSet(Set set){
        sets.add(set);
    }

    public void addExerciseGoal(ExerciseGoal exerciseGoal){
        this.exerciseGoal = exerciseGoal;
    }

    public void addExerciseGoal(ArrayList<Set> sets){
        this.exerciseGoal = new ExerciseGoal(sets);
    }

    public ExerciseGoal getExerciseGoal(){
        return exerciseGoal;
    }



}
