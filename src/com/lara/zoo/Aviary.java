package com.lara.zoo;

import java.util.ArrayList;

public class Aviary {

    private String kindAviary;
    protected ArrayList<Animal> animals;

    protected Aviary(String kindAviary) {
        this.kindAviary = kindAviary;

    }

    public String getKindAviary() {
        return kindAviary;
    }
    protected void setAnimals() {
        animals = new ArrayList<>();
    }
    protected void addAnimals(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        StringBuilder builderA = new StringBuilder();
        builderA.append("\nВид вольера: ").append(getKindAviary());
        builderA.append("\nКто живет в вольере: ").append(getAnimals());
        return builderA.toString();

    }
}
