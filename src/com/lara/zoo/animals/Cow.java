package com.lara.zoo.animals;

import com.lara.zoo.Animal;
import com.lara.zoo.Walkable;
import com.lara.zoo.aviaries.OpenAviary;

public class Cow extends Animal implements Walkable {

    private int countLegs;
    private String howMove;

    public Cow(int age, int weigth) {
        super("Корова", age, weigth);
        this.countLegs = 4;
        this.getWalk();
        super.setAviary(new OpenAviary(),this);
    }

    public int getCountLegs() {
        return countLegs;
    }

    public String getHowMove() {
        return howMove;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("\nКоличество ног: ").append(getCountLegs());
        builder.append("\nКак передвигается: ").append(getHowMove());

        return builder.toString();
    }

    @Override
    public String getWalk() {

        return howMove+=" Ходят ";
    }
}
