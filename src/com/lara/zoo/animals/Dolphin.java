package com.lara.zoo.animals;

import com.lara.zoo.Animal;
import com.lara.zoo.Swimable;
import com.lara.zoo.aviaries.Aquarium;

public class Dolphin extends Animal implements Swimable {

    private String howMove ="";
    public Dolphin(int age, int weigth) {
        super("Дельфин", age, weigth);
        this.getSwim();
        super.setAviary(new Aquarium(),this);
    }

    public String getHowMove() {
        return howMove;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("\nКак передвигается: ").append(getHowMove());

        return builder.toString();

    }

    @Override
    public String getSwim() {
        return howMove+=" Плавают ";
    }
}
