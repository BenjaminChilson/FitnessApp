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
        anticipateSetsBasedOnExerciseSetRepetitions();
    }

    public void logExercise(){
        ensureGoalForNextTimeExist();
        exercise.addExerciseLog(sets, goalForNextTime);
    }

    public void addGoalForNextTime(){
        goalForNextTime = new ExerciseGoal(this);
    }

    public void adjustWeightGoalForNextTime(double ...newWeights){
        ensureGoalForNextTimeExist();
        for(int i = 0; i < newWeights.length; i++){
            goalForNextTime.getSetAtIndex(i).setWeight(newWeights[i]);
        }
    }

    private void ensureGoalForNextTimeExist(){
        if(goalForNextTime == null){
            addGoalForNextTime();
        }
    }

    private void anticipateSetsBasedOnGoal(){
        this.appendSets(goalToMeet);
    }

    public void anticipateSetsBasedOnExerciseSetRepetitions(){
        ArrayList<Integer> setRepetitions = this.exercise.getSetRepetitions();
        for(Integer repetition : setRepetitions){
            addSet(repetition, 0, WeightUnit.POUNDS);
        }
    }

    public void addSetWeights(double ...weights){
        for(int i = 0; i < sets.size(); i++){
            getSetAtIndex(i).setWeight(weights[i]);
        }
    }
}
