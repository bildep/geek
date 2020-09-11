import java.util.Scanner;

public class Task {
  public static void main(String[] args) {


    while (true) {
      boolean win = false;
      Scanner sc = new Scanner(System.in);
      int key = (int)(Math.random()*10);
      System.out.println("Отгадайте число от 0 до 9: ");
      int i = 0;
      while (true) {
        int a = sc.nextInt();
        if (a > key) {
          System.out.println("Число меньше");
        } else if (a < key){
          System.out.println("Число больше");
        } else {
          win = true;
          break;
        }

        i++;
        if(i == 3) break;

      }
      System.out.println((win) ? "Вы выиграли" : "Вы проиграли. Загаданное число: " + key);
      System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
      int next = sc.nextInt();
      if (next == 0) {
        break;
      }
    }

  }
}
