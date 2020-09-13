import java.util.Random;
import java.util.Scanner;

public class TicTac {
  public static final int SIZE = 3;
  public static final int DOTS_TO_WIN = 3;

  public static final char DOT_EMPTY = '•';
  public static final char DOT_HUMAN = 'X';
  public static final char DOT_AI = 'O';
  public static final String WIN_HUMAN = "XXX";
  public static final String WIN_AI = "000";

  public static final String EMPTY = " ";
  public static final String EMPTY_FIRST = "♥ ";

  public static final char[][] map = new char[SIZE][SIZE];
  public static final Scanner scanner = new Scanner(System.in);
  public static final Random random = new Random();

  public static void main(String[] args) {

    turnGame();

  }

  private static void turnGame() {
    initMap();

    printMap();

    playGame();
  }

  private static void initMap() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        map[i][j] = DOT_EMPTY;
      }
    }
  }

  private static void printMap() {
    printMapHeader();

    printMapRow();
  }

  private static void printMapHeader() {
    System.out.print(EMPTY_FIRST);
    for (int i = 0; i < SIZE; i++) {
      System.out.print(i + 1 + EMPTY);
    }
    System.out.println();
  }

  private static void printMapRow() {
    for (int i = 0; i < SIZE; i++) {
      System.out.print(i + 1 + EMPTY);
      for (int j = 0; j < SIZE; j++) {
        System.out.print(map[i][j] + EMPTY);
      }
      System.out.println();
    }
    System.out.println();
  }

  private static void playGame() {


    while (true) {
      humanTurn();
      printMap();
      checkEnd(DOT_HUMAN);

      aiTurn();
      printMap();
      checkEnd(DOT_AI);
    }
  }

  private static void humanTurn() {
    int rowNumber, columnNumber;

    do {
//          wrap
      System.out.println("Ход человека! Введите номер строки и столбца!");

      System.out.print("Строка = ");
      rowNumber = scanner.nextInt();

      System.out.print("Столбец = ");
      columnNumber = scanner.nextInt();

    } while (!isCellValid(rowNumber, columnNumber));

    map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;
  }

  private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAI) {

    if(!isAI && ((rowNumber < 1) || (rowNumber > SIZE) || (columnNumber < 1) || (columnNumber > SIZE))) {
      System.out.println("\nПроверьте значения строки и столбца");
      return false;
    }

    if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
      if (!isAI)
        System.out.println("\nВы выбрали занятую ячйку!");
      return false;
    }

    return true;
  }

  private static boolean isCellValid(int rowNumber, int columnNumber){
    return isCellValid(rowNumber, columnNumber, false);
  }

  private static boolean checkEnd(char symbol) {

    boolean isEnd = false;


    if (checkWin(symbol)) {
      String winMessage;
      if (symbol == DOT_HUMAN) {
        winMessage = "УРА! Вы победили!";
      } else {
        winMessage = "Восстание близко! AI победил!";
      }
      System.out.println(winMessage);
      isEnd = true;
    }

    if (isMapFull()) {
      System.out.println("Ничья!");
      isEnd = true;
    }

    if (isEnd) {
      System.exit(0);
    }
    return isEnd;
  }

  private static boolean checkWin(char symbol) {

    if (checkRow(symbol) || checkColumn(symbol) || checkDiagonals(symbol)) return true;

    return false;
  }

  private static boolean checkRow(char symbol) {

    for (int i = 0; i < map.length; i++) {
        String str = String.valueOf(map[i]);
        if (WIN_HUMAN.equals(str) || WIN_AI.equals(str)) {
          return true;
        }
    }
    return false;
  }

  private static boolean checkColumn(char symbol) {

    char[] str = new char[map.length];
    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map.length; j++) {
            str[j] = map[j][i];
        }

        String charStr = String.valueOf(str);
        if (WIN_HUMAN.equals(charStr) || WIN_AI.equals(charStr)) {
          return true;
        }
      }

    return false;
  }

  private static boolean checkDiagonals(char symbol) {

    char[] diagonal1 = new char[map.length];
    char[] diagonal2 = new char[map.length];

    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        if (i == j) diagonal1[i] = map[i][i];

        if ((i + j) == map.length - 1) {
          diagonal2[i] = map[i][j];
        }
      }
    }
      String diagStr1 = String.valueOf(diagonal1);
      String diagStr2 = String.valueOf(diagonal2);

      if (WIN_HUMAN.equals(diagStr1) || WIN_AI.equals(diagStr1) || WIN_HUMAN.equals(diagStr2) || WIN_AI.equals(diagStr2)) {
        return true;
      }
    return false;
  }

  private static boolean isMapFull() {
    for (char[] chars : map) {
      for (char aChar : chars) {
        if (aChar == DOT_EMPTY) {
          return false;
        }
      }
    }
    return true;
  }

  private static void aiTurn() {
    int rowNumber, columnNumber;

    do {
      rowNumber = random.nextInt(SIZE) + 1;
      columnNumber = random.nextInt(SIZE) + 1;

    } while (!isCellValid(rowNumber, columnNumber, true));

    map[rowNumber - 1][columnNumber - 1] = DOT_AI;
  }


}
