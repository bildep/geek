
public class Cat {

    protected final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {

        return name;
    }

    public int getAppetite() {

        return appetite;
    }

    public void eat(Plate plate) {

        if (! this.isSatiety()) {

            if (plate.getFood() >= appetite) {
                doEat(plate);
                this.satiety = true;System.out.println("Кот " + this.name + " питается");
            }

        } else {
            System.out.println("Кот уже сытый");
        }




    }

    private void doEat(Plate plate) {

        plate.decreaseFood(appetite);
    }

    public String print() {
        if (this.isSatiety()) {
            return "Кот "+ this.name +" сытый";
        }
        return "Кот "+ this.name +" голодный";
    }

    private boolean isSatiety() {
        return satiety;
    }
}
