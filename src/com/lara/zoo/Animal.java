package com.lara.zoo;

public abstract  class Animal {

    private int age;
    private int weigth;
    private String kindAnimal;
    protected Aviary aviary;

    protected Animal(String kindAnimal, int age, int weigth) {
        this.kindAnimal = kindAnimal;
        this.age = age;
        this.weigth = weigth;

    }

    protected void setAviary(Aviary aviary, Animal animal) {
        this.aviary = aviary;
        this.aviary.setAnimals();
        this.aviary.addAnimals(animal);
    }

    public Aviary getAviary(){
     return aviary;
    }

    public String getKindAnimal() {
        return kindAnimal;
    }

    public int getAge() {
        return age;
    }

    public int getWeigth() {
        return weigth;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nВид животного: ").append(getKindAnimal());
        builder.append("\nВозраст: ").append(getAge());
        builder.append("\nВес: ").append(getWeigth());
        builder.append("\nВ каком вольере живет: ").append(getAviary().getKindAviary());
        return builder.toString();
    }
}
