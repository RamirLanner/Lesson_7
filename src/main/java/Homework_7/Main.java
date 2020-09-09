package Homework_7;

import Cat.Cat;
import Plate.Plate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Cat cat1 = new Cat("Княгиня де Мур Муа", 5);
        Cat[] cats = new Cat[10];
        Random random = new Random();
        for (int i=0; i<cats.length; i++) {
            cats[i] = new Cat("Cat"+1,2+random.nextInt(5));
        }

        Plate plate1 = new Plate(45);
        plate1.info();
        for (Cat cat:cats) {
            cat.eat(plate1); //коты едят
            //cat.info(); //вывод информации
        }
        plate1.info();

        plate1.putFoodInPlate();//добавление еды в тарелку, ввод с консоли
        plate1.info();
    }
}
