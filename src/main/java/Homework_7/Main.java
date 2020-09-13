package Homework_7;

import Cat.Cat;
import Plate.Plate;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Княгиня де Мур Муа", 5);
        Cat[] cats = new Cat[10];
        Random random = new Random();
        for (int i=0; i<cats.length; i++) {
            cats[i] = new Cat("Cat"+1,2+random.nextInt(5));
        }

        Plate plate1 = new Plate(5);
        plate1.info();
//        cat1.info();
//        cat1.eat(plate1);
        for (Cat cat:cats) {
            cat.eat(plate1); //коты едят
            //cat.info(); //вывод информации
        }
//        cat1.info();
        plate1.info();

        putFoodInPlate(plate1);//добавление еды в тарелку, ввод с консоли
        plate1.info();
    }

    public static void putFoodInPlate(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Сколько еды положить в тарелку?(целое положительное число)");
            try {
                x = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат");
                scanner.nextLine();
            }
            if(x >0){
                plate.setFoodValue(plate.getFoodValue()+x);
                break;
            }
            else{
                System.out.println("Неверный формат");
            }
        } while (true);
    }
}
