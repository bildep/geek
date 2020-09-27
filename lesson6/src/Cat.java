public class Cat extends Animal{

  private final int MAX_RUN = 200;
  private final int MAX_JUMP = 2;


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
      System.out.println("swim: false");
  }

  @Override
  public void jump(int height) {
      if (height <= MAX_JUMP) {
        System.out.println("jump: true");
      } else {
        System.out.println("jump: false");
      }
  }
}

