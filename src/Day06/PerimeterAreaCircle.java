package Day06;
/*
1. Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas:
perimeter = 2 * radius * 𝜋 area = radius * radius * 𝜋
 */

public class PerimeterAreaCircle {
    public static void main(String[] args) {
        double radius=5.5;
        double perimeter=2*radius*3.14;
        double area=radius*radius*3.14;
        System.out.println("Perimeter of the circle is "+perimeter+" inch");
        System.out.println("Area of the circle is " +area+" inch");



    }
}
