

public class Person {
  private String fio;
  private String position;
  private String email;
  private String phone;
  private int zp;
  private int age;

  Person(String fio, String position, String email, String phone, int zp, int age) {
    this.fio = fio;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.zp = zp;
    this.age = age;
  }

  @Override
  public String toString() {
    return fio + " " + position + " " + email + " " + phone + " " + zp + " " + age;
  }

  public int getAge() {
    return age;
  }

}
