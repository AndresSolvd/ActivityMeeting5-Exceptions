// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.lang.Math;

import org.apache.logging.log4j.Logger;


public class ExceptionsTask {
    public static void rectangleArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input 2 side sizes for rectangle area, on different lines");
        int length = scan.nextInt();
        int width = scan.nextInt();
        int area = length * width;
        System.out.println("Area = " + area);
        scan.close();

    }

    public static void rectanglePerimeter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input 2 side sizes for rectangle perimeter, on different lines");
        int length = scan.nextInt();
        int width = scan.nextInt();
        int perimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter = " + perimeter);
        scan.close();
    }

    public static void circleArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Radius");
        int radius = scan.nextInt();
        double area = Math.PI + radius;
        System.out.println("Circle Area " + area);
        scan.close();
    }

    public static void circlePerimeter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Radius");
        int radius = scan.nextInt();
        double perimeter = Math.PI + radius * 2;
        System.out.println("Circle perimeter " + perimeter);
        scan.close();
    }

    public class negativeNumber extends Exception {
        public negativeNumber() {
            
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 1 for rectangle perimeter 2 for rectangle area");
        System.out.println("Please input 3 for circle perimeter 4 for circle area");
        int userShape = scan.nextInt();

        switch (userShape) {
            case 1:
                try {
                    rectangleArea();
                } catch (Exception InputMismatchException) {
                    System.out.println("Please input a number!");
                }
                break;
            case 2:
                try {
                    rectanglePerimeter();
                } catch (Exception InputMismatchException) {
                    System.out.println("Please input a number!");
                }
                break;
            case 3:
                try {
                    circleArea();
                } catch (Exception InputMismatchException) {
                    System.out.println("Please input a number!");
                }
                break;
            case 4:
                try {
                    circlePerimeter();
                } catch (Exception InputMismatchException) {
                    System.out.println("Please input a number!");
                }
                break;
        }
        scan.close();
    }


}

/*App should do following calculations:
Requirements:
4. At least 3 custom exceptions
5. Several try-catch blocks to handle exceptional cases (for example user enters something wrong)*/