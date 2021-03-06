package com.example.task1.Lines;

import java.util.ArrayList;

import org.javatuples.*;

public class States {
    private String name;
    private Integer group;
    private Double latitude;
    private Double longitude;
    private ArrayList<Triplet<Integer,Double,Double>> coordinatesList;

    public States(){
        this.coordinatesList=new ArrayList<Triplet<Integer, Double, Double>>();
    }

    public States(String name,Integer group,Double latitude,Double longitude) {
        this.name = name;
        this.group=group;
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public void addCoordinates(int group, double latitude, double longitude){
        coordinatesList.add(new Triplet<Integer,Double,Double>(group,latitude,longitude));
    }

    public ArrayList<Triplet<Integer, Double, Double>> getCoordinatesList() {
        return coordinatesList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinatesList(ArrayList<Triplet<Integer, Double, Double>> coordinatesList) {
        this.coordinatesList = coordinatesList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}


