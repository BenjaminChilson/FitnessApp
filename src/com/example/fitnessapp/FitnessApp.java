package com.example.fitnessapp;

import java.util.ArrayList;

public class FitnessApp {
    public static void main(String[] args) {


        Exercise curls = new Exercise("Curls", 10, 8, 6);

        ExerciseInProgress exercise1 = curls.startExercise();
        exercise1.addSetWeights(25, 27.5, 30);
        exercise1.adjustWeightGoalForNextTime(27.5, 30, 32.5);
        exercise1.logExercise();


        Exercise rows = new Exercise("Rows", 10, 8, 6);

        ExerciseInProgress exercise2 = rows.startExercise();
        exercise2.addSetWeights(105, 120, 120);
        exercise2.adjustWeightGoalForNextTime(120, 120, 120);
        exercise2.logExercise();

        Workout workout1 = new Workout("Back and Biceps");
        workout1.addExercises(curls, rows);

        workout1.printWorkout();
    }
}
