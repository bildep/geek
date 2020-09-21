

public class Main {

  public static void main(String[] args) {

    Person[] persArray = new Person[5];

    persArray[0] = new Person("Иванов Иван Сергеевич", "директор", "sdsds@mail.ru", "+7953682186", 60000, 45);
    persArray[1] = new Person("Тюскалов Александр Николаевич", "бухгалтер", "buh@mail.ru", "+79598798", 40000, 35);
    persArray[2] = new Person("Смирнов Сергей Сергеевич", "менеджер", "men@mail.ru", "+7957567456", 30000, 30);
    persArray[3] = new Person("Петров Антон Сергеевич", "инженер", "sdyjtsds@mail.ru", "+7953633433", 40000, 25);
    persArray[4] = new Person("Симонов Иван Степанович", "механик", "sdsds21@mail.ru", "+795368432", 30000, 42);

    for (int i = 0; i < persArray.length; i++) {
        if (persArray[i].getAge() > 40) {
          System.out.println(persArray[i].toString());
        }
    }

  }
}
