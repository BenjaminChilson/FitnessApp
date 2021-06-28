package com.example.fitnessapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Exercise implements Serializable {
    String name;
    ArrayList<Integer> setRepetitions;
    ArrayList<ExerciseLog> exerciseLogs;

    public Exercise(String name) {
        this.name = name;
        setRepetitions = new ArrayList<>();
        exerciseLogs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSetRepetition(Integer setRepetition){
        setRepetitions.add(setRepetition);
    }

    public void addExerciseLog(ArrayList<Set> sets, ExerciseGoal exerciseGoal){
        exerciseLogs.add(new ExerciseLog(sets, exerciseGoal));
    }

    public ArrayList<ExerciseLog> getExerciseLogs() {
        return exerciseLogs;
    }

    public void printExercise() {
        System.out.println(name);
        System.out.print("\t\t\t");
        for(int i = 0; i < setRepetitions.size(); i++){
            System.out.print(setRepetitions.get(i) + " Reps");
            if(i < setRepetitions.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        System.out.println("\t\t\tLast Recorded Exercise:");
        printLastExerciseLog();
        System.out.println("\t\t\tGoal for next time:");
        printMostRecentExerciseGoal();
    }

    public void printMostRecentExerciseGoal(){
        ExerciseGoal exerciseGoal = getMostRecentExerciseGoal();
        if (exerciseGoal != null) {
            exerciseGoal.print();
        } else {
            System.out.println("\t\t\t\tNo Current Goal Recorded for this Exercise");
        }
    }

    public void printLastExerciseLog(){
        getLastExerciseLog().print();
    }

    public ExerciseLog getLastExerciseLog(){
        if(exerciseLogs.size() > 0){
            return exerciseLogs.get(exerciseLogs.size() - 1);
        }
        return new ExerciseLog(new ArrayList<>(), null);
    }

    public ExerciseInProgress startExercise(){
        return new ExerciseInProgress(this);
    }

    public ExerciseGoal getMostRecentExerciseGoal(){
        return getLastExerciseLog().getExerciseGoal();
    }
}
