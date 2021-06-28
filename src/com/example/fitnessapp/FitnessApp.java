package com.example.fitnessapp;

import java.util.ArrayList;

public class FitnessApp {
    public static void main(String[] args) {


        Exercise curls = new Exercise("Curls");
        curls.addSetRepetition(10);
        curls.addSetRepetition(8);
        curls.addSetRepetition(6);

        ExerciseInProgress exercise1 = curls.startExercise();
        exercise1.addSet(new Set(10, 25, WeightUnit.POUNDS));
        exercise1.addSet(new Set(8, 27.5, WeightUnit.POUNDS));
        exercise1.addSet(new Set(6, 30, WeightUnit.POUNDS));

        exercise1.addGoalForNextTime();
        ArrayList<Double> newGoalWeights1 = new ArrayList<>();
        newGoalWeights1.add(27.5);
        newGoalWeights1.add(30.0);
        newGoalWeights1.add(32.5);
        exercise1.adjustWeightGoalForNextTime(newGoalWeights1);
        exercise1.logExercise();


        Exercise rows = new Exercise("Rows");
        rows.addSetRepetition(10);
        rows.addSetRepetition(8);
        rows.addSetRepetition(6);

        ExerciseInProgress exercise2 = rows.startExercise();
        exercise2.addSet(new Set(10, 105, WeightUnit.POUNDS));
        exercise2.addSet(new Set(8, 120, WeightUnit.POUNDS));
        exercise2.addSet(new Set(6, 120, WeightUnit.POUNDS));

        exercise2.addGoalForNextTime();
        ArrayList<Double> newGoalWeights2 = new ArrayList<>();
        newGoalWeights2.add(120.0);
        newGoalWeights2.add(120.0);
        newGoalWeights2.add(120.0);
        exercise2.adjustWeightGoalForNextTime(newGoalWeights2);
        exercise2.logExercise();

        Workout workout1 = new Workout("Back and Biceps");
        workout1.addExercise(curls);
        workout1.addExercise(rows);

        workout1.printWorkout();
    }
}
