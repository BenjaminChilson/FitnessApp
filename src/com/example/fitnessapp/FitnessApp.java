package com.example.fitnessapp;

public class FitnessApp {
    public static void main(String[] args) {

        Exercise exercise1 = new Exercise("Curls");
        exercise1.addSet(new Set(10, 25, Set.WeightUnit.POUNDS));
        exercise1.addSet(new Set(8, 27.5, Set.WeightUnit.POUNDS));
        exercise1.addSet(new Set(6, 30, Set.WeightUnit.POUNDS));

        Exercise exercise2 = new Exercise("Rows");
        exercise2.addSet(new Set(10, 105, Set.WeightUnit.POUNDS));
        exercise2.addSet(new Set(8, 120, Set.WeightUnit.POUNDS));
        exercise2.addSet(new Set(6, 120, Set.WeightUnit.POUNDS));

        Workout workout1 = new Workout("Back and Biceps");
        workout1.addExercise(exercise1);
        workout1.addExercise(exercise2);

        workout1.printWorkout();
    }
}
