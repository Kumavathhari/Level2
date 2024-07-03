package Level2;

import java.util.Scanner;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle {
    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    static double calculateRectangleArea(Rectangle rect) {
        return rect.calculateArea();
    }

    static double calculateTriangleArea(Triangle tri) {
        return tri.calculateArea();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double rectLength = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double rectBreadth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectLength, rectBreadth);

        System.out.print("Enter base of triangle: ");
        double triBase = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double triHeight = scanner.nextDouble();

        Triangle triangle = new Triangle(triBase, triHeight);

        System.out.println("Area of rectangle: " + calculateRectangleArea(rectangle));

        System.out.println("Area of triangle: " + calculateTriangleArea(triangle));

        scanner.close();
    }
}
