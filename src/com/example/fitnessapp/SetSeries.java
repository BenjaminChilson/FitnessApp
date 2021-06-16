package com.example.fitnessapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SetSeries {
    ArrayList<Set> sets;

    public SetSeries(){
        sets = new ArrayList<>();
    }

    public SetSeries(SetSeries setSeries){
        this.sets = new ArrayList<>();
        for(Set s : setSeries.getSets()){
            this.sets.add(new Set(s.repetitions, s.weight, s.weightUnit));
        }
    }

    public SetSeries(ArrayList<Set> sets){
        this.sets = sets;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public void print(){
        if(sets.isEmpty()){
            System.out.println("No Sets Recorded for this Exercise");
            return;
        }
        for(Set s : sets){
            System.out.print("\t\t\t\t");
            s.printSet();
        }
    }
}
