package lesson7;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
	    Cat cat = new Cat("Barsik",random.nextInt(6)+15);
	    Cat cat1 = new Cat("Cheroki", random.nextInt(6)+15);
        Cat cat2 = new Cat("Murka", random.nextInt(6)+15);
        Cat cat3 = new Cat("Vaska", random.nextInt(6)+15);
        Cat cat4 = new Cat("Chernysh", random.nextInt(6)+15);
        Cat cat5 = new Cat("Chara", random.nextInt(6)+15);
        Plate plate = new Plate(random.nextInt(50)+20);
        plate.info();
        Cat [] cats = new Cat[] {cat, cat1, cat2, cat3, cat4, cat5};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}
