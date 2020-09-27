public class Main {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    Dog dog1 = new Dog();

    cat1.jump(111);
    cat1.jump(2);

    cat1.run(121);

    cat1.swim(22);

    dog1.jump(122);
    dog1.run(120);
    dog1.swim(10);
  }
}
