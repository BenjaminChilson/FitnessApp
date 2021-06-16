package com.example.fitnessapp;

import java.util.ArrayList;

public class ExerciseLog extends SetSeries{

    public ExerciseLog(ArrayList<Set> sets) {
        super();
        this.sets = sets;
    }

    public void addSet(Set set){
        sets.add(set);
    }

}
