public class Dog extends Animal {

  private final int MAX_RUN = 500;
  private final double MAX_JUMP = 0.5;
  private final int MAX_SWIM = 10;

  @Override
  public void run(int length) {
    if (length <= MAX_RUN) {
      System.out.println("run: true");
    } else {
      System.out.println("run: false");
    }
  }

  @Override
  public void swim(int length) {
    if (length <= MAX_SWIM) {
      System.out.println("swim: true");
    } else {
      System.out.println("swim: false");
    }
  }

  @Override
  public void jump(int height) {
    if (height <= MAX_JUMP) {
      System.out.println("swim: true");
    } else {
      System.out.println("swim: false");
    }

  }
}
