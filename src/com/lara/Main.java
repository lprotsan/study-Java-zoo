package com.lara;

import com.lara.zoo.Animal;
import com.lara.zoo.Aviary;
import com.lara.zoo.animals.Cow;
import com.lara.zoo.animals.Duck;
import com.lara.zoo.animals.Dolphin;
import com.lara.zoo.aviaries.Aquarium;
import com.lara.zoo.aviaries.GridAviary;
import com.lara.zoo.aviaries.OpenAviary;
import com.lara.zoo.aviaries.Terrarium;

import java.util.ArrayList;

public class Main {

    public static <Artiodactyls, Feathered, Waterfowl> void main(String[] args) {
/*Разработать иерархию из следующих классов, необходимых для реализации
модели зоопарка:
 животные 4 типов: копытные, пернатые, водоплавающие, рептилии;
 вольеры 4 типов: открытые вольеры, покрытые сеткой вольеры, аквариумы,
террариумы.
Для каждого из классов реализовать переопределенный метод абстрактного
класса «животное», обладающего общими параметрами (вес, возраст), который будет
расселять животных в соответствующие вольеры. В основном методе программы
сформировать зоопарк и организовать вывод списка вольеров и обитающих в них
животных.*/



        Cow anim = new Cow(5, 25);
        Duck anim2 = new Duck(2, 4);
        Dolphin anim3 = new Dolphin(4,105);


        System.out.println(anim.toString());
        System.out.println(anim2.toString());
        System.out.println(anim3.toString());
        System.out.println("------------------------");

        System.out.println(anim.getAviary().getKindAviary());
        System.out.println(anim.getAviary().getAnimals());
        System.out.println(anim2.getAviary().getKindAviary());
        System.out.println(anim2.getAviary().getAnimals());
        System.out.println(anim3.getAviary().getKindAviary());
        System.out.println(anim3.getAviary().getAnimals());


        //////

    }
}
