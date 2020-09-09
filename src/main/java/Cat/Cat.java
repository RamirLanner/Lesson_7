package Cat;

import Plate.Plate;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety =false;//по умолчанию конечно и так false, но решил объявить явно.
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info(){
        System.out.println(this.toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Котейка(" +
                "Имя='" + name + '\'' +
                ", аппетит=" + appetite +
                ", сытость=" + satiety +
                ')';
    }

    public void eat(Plate plate){
        satiety = plate.decreaseFood(this.appetite);
        //кот не поест если в тарелке не будет хватать еды.
        //попросит доложить в тарелку недостающее количество
    }

}
