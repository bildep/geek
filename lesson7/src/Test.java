

public class Test {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Мартин", 5);
        cat[1] = new Cat("Василий", 3);
        cat[2] = new Cat("Мурзик", 4);

        Plate plate= new Plate(10);
        plate.info();

        for (Cat cat1 : cat) {
            cat1.eat(plate);
        }

        plate.info();

        for (Cat cat1 : cat) {
            System.out.println(cat1.print());
        }
        cat[2].eat(plate);

        plate.info();
    }
}
