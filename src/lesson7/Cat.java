package lesson7;

import java.util.Random;

public class Cat {
    private static Random random = new Random();
    private String name;
    private int fedUp;
    private boolean isFedUp = false;

    public Cat(String name, int fedUp) {
        this.name = name;
        this.fedUp = fedUp;
    }

    public boolean isFedUp() {
        return isFedUp;
    }

    public void setFedUp(boolean fedUp) {
        isFedUp = fedUp;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println(name + " подошел к миске с едой...");
        plate.decreaseFood(this.fedUp, this);
        while(!this.isFedUp) {
            int foodAdd = random.nextInt(60) + 10;
            System.out.println("Хозяин добавил корма: " + foodAdd + " еды");
            plate.addFood(foodAdd);
            plate.decreaseFood(this.fedUp, this);
            }
        if (this.isFedUp) {System.out.println("Кот " + this.name + " сыт!");}
    }

}
