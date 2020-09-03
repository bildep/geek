public class Main {

    public static void main(String[] args) {

        byte bt = 110;
        short sh = 12312;
        int valInt = -1232312;
        long longVal = 1432342341;
        float flVal = 123.1231f;
        double doubVal = 23123.2311;
        char ch = 'в';
        boolean isAvail = true;
        String myStr = "UJGUIghjkhjk";



        System.out.println(getResult(4, 3, 4, 4));
        System.out.println(compare(12, 9));
        checkValue(-45);
        System.out.println(isNegative(-3));

        printHello("Саня");
        isLeap(2400);
    }

    public static double getResult(double a, double b, double c, double d) {
            if (d != 0) {
                return a * (b + (c / d));
            } else {
                return 0;
            }
    }

    public static boolean compare(double a, double b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        return false;
    }

    public static void checkValue(int val) {
        if (val >=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год невисокосный");
                }
            } else {
                System.out.println("Год високосный");
            }
        } else {
            System.out.println("Год невисокосный");
        }
    }
}
