package Day06;

import sun.lwawt.macosx.CSystemTray;

/*
2. Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
area = width * height
 */
public class AreaRectangle {
    public static void main(String[] args) {
        double width=10;
        double height=17;
        double area=width*height;
        System.out.println("Width of the rectangle is: "+width+" inch");
        System.out.println("Height of the rectangle is: "+height+" inch");
        System.out.println("Area of rectangle is: "+area+" inch");


    }
}
