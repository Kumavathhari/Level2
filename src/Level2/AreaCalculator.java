package Level2;

public class AreaCalculator {
    public static double calculateArea(double side) {
        return side * side;
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculatingArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double squareArea = calculateArea(5.0);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = calculateArea(3.0);
        System.out.println("Area of circle: " + circleArea);
    }
}
