package com.example.fitnessapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExerciseGoal extends SetSeries{

    public ExerciseGoal(SetSeries setSeries){
        super(setSeries);
    }

    public ExerciseGoal(ArrayList<Set> sets){
        super(sets);
    }

}
