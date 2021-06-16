package com.example.fitnessapp;

import java.util.ArrayList;

public class FitnessApp {
    public static void main(String[] args) {


        Exercise curls = new Exercise("Curls");
        curls.addSetRepetition(10);
        curls.addSetRepetition(8);
        curls.addSetRepetition(6);
        ExerciseInProgress exercise1 = new ExerciseInProgress(curls);
        exercise1.addSet(new Set(10, 25, WeightUnit.POUNDS));
        exercise1.addSet(new Set(8, 27.5, WeightUnit.POUNDS));
        exercise1.addSet(new Set(6, 30, WeightUnit.POUNDS));


        ArrayList<Set> goalSets1 = new ArrayList<>();
        goalSets1.add(new Set(10, 27.5, WeightUnit.POUNDS));
        goalSets1.add(new Set(8, 30, WeightUnit.POUNDS));
        goalSets1.add(new Set(6, 32.5, WeightUnit.POUNDS));
        curls.addExerciseGoal(new ExerciseGoal(goalSets1));

        Exercise rows = new Exercise("Rows");
        rows.addSetRepetition(10);
        rows.addSetRepetition(8);
        rows.addSetRepetition(6);
        ExerciseInProgress exercise2 = new ExerciseInProgress(rows);
        exercise2.addSet(new Set(10, 105, WeightUnit.POUNDS));
        exercise2.addSet(new Set(8, 120, WeightUnit.POUNDS));
        exercise2.addSet(new Set(6, 120, WeightUnit.POUNDS));

        ArrayList<Set> goalSets2 = new ArrayList<>();
        goalSets2.add(new Set(10, 120, WeightUnit.POUNDS));
        goalSets2.add(new Set(8, 120, WeightUnit.POUNDS));
        goalSets2.add(new Set(6, 120, WeightUnit.POUNDS));
        rows.addExerciseGoal(new ExerciseGoal(goalSets2));

        exercise1.logExercise();
        exercise2.logExercise();

        Workout workout1 = new Workout("Back and Biceps");
        workout1.addExercise(curls);
        workout1.addExercise(rows);

        workout1.printWorkout();
    }
}
