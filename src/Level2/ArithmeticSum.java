package Level2;

public class ArithmeticSum {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int sum2 = sum(10, 20);
        int sum3 = sum(10, 20, 30);
        int sum4 = sum(10, 20, 30, 40);

        System.out.println("Arithmetic sum of two variables: " + sum2);
        System.out.println("Arithmetic sum of three variables: " + sum3);
        System.out.println("Arithmetic sum of four variables: " + sum4);
    }
}
