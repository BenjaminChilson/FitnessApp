package com.example.fitnessapp;

import java.util.ArrayList;

public class ExerciseInProgress extends SetSeries{
    Exercise exercise;
    ExerciseGoal goalToMeet;
    ExerciseGoal goalForNextTime;

    public ExerciseInProgress(Exercise exercise) {
        super();
        this.exercise = exercise;
        this.goalToMeet = exercise.getMostRecentExerciseGoal();
        this.goalForNextTime = null;
    }

    public void logExercise(){
        exercise.addExerciseLog(sets, goalForNextTime);
    }

    public void addGoalForNextTime(){
        goalForNextTime = new ExerciseGoal(this);
    }

    public void adjustWeightGoalForNextTime(ArrayList<Double> newWeights){
        for(int i = 0; i < newWeights.size(); i++){
            goalForNextTime.getSetAtIndex(i).setWeight(newWeights.get(i));
        }
    }
}
