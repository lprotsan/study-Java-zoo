package com.lara.zoo.animals;

import com.lara.zoo.Animal;
import com.lara.zoo.Flyable;
import com.lara.zoo.Swimable;
import com.lara.zoo.Walkable;
import com.lara.zoo.aviaries.GridAviary;

public class Duck extends Animal implements Flyable, Swimable, Walkable {
    protected int countWings;
    protected int countLegs;
    private String howMove = "";

    public Duck(int age, int weigth) {
        super("Утка", age, weigth);
        this.countLegs = 2;
        this.countWings = 2;
        this.getFly();
        this.getSwim();
        this.getWalk();
        super.setAviary(new GridAviary(),this);
    }

    public String getHowMove() {
        return howMove;
    }

    public int getCountLegs() {
        return countLegs;
    }

    public int getCountWings() {
        return countWings;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("\nКоличество ног: ").append(getCountLegs());
        builder.append("\nКоличество крыльев: ").append(getCountWings());
      //  builder.append("\nВ каком вольере проживают: ").append(getAviary());
        builder.append("\nКак передвигается: ").append(getHowMove());

        return builder.toString();

    }

    @Override
    public String getFly() {
        return howMove+=" Летают ";
    }

    @Override
    public String getSwim() {
        return howMove+=" Плавают ";
    }

    @Override
    public String getWalk() {
        return howMove+=" Ходят ";
    }
}
