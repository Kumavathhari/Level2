package Level2;

import java.util.Scanner;

public class Cuboid {
    double length, breadth, height;

    Cuboid(double l, double b, double h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    double volume() {
        return length * breadth * height;
    }

    double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    double perimeter() {
        return 4 * (length + breadth + height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        Cuboid cuboid = new Cuboid(length, breadth, height);

        System.out.println("Volume of cuboid: " + cuboid.volume());

        System.out.println("Area of cuboid: " + cuboid.area());

        System.out.println("Perimeter of cuboid: " + cuboid.perimeter());

        scanner.close();
    }
}
