public class javabasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        compareNumbers(a, b);
    }

    public static void compareNumbers(int x, int y) {
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (y > x) {
            System.out.println(y + " is greater than " + x);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}