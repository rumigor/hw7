package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount, Cat cat){
        if (amount <= food) {
            food -= amount;
            cat.setFedUp(true);
        }
        else System.out.println("Недостаточно еды, кот " + cat.getName() + " остался голоден!");
    }

    public void info(){
        System.out.println("В тарелке: "+ food + " еды");
    }

    public void addFood(int amount) {
        food += amount;
    }

}
