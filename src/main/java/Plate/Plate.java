package Plate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Plate {
    private int foodValue;

    public Plate(int foodValue) {
        this.foodValue = foodValue;
    }

    public int getFoodValue() {
        return foodValue;
    }

    public void setFoodValue(int foodValue) {
        this.foodValue = foodValue;
    }

    @Override
    public String toString() {
        return "Тарелка(" +
                "Еды в тарелке=" + foodValue +
                ')';
    }

    public boolean decreaseFood(int n) {
        if (foodValue < n) {
            System.out.printf("В тарелке не хватает еды, доложите еды в количестве = %s\n", (n - foodValue));
            return false;
        } else {
            foodValue -= n;
            return true;
        }
        /*
        //можно еще так ограничить что бы в '-' не уходить
        if(foodValue < n){
            System.out.printf("В тарелке не хватает еды, доложите еды в количестве = %s\n",(n-foodValue));
            System.out.println("Все съедено, кот не доволен, просит вторую порцию");
            foodValue-=foodValue;
        }
        else{
            foodValue -= n;
        }
        */
    }

    public void info() {
        System.out.println(this.toString());
    }


}
