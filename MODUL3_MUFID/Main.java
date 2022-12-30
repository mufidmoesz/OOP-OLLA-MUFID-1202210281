package MODUL3_MUFID;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calc = new Calculation();

        do {
            try {
                System.out.println("Program Menu");
                System.out.println("1. Calculate Square");
                System.out.println("2. Calculate Circle");
                System.out.println("3. Calculate Trapezoid");
                System.out.println("0. Exit");

                System.out.print("Select Menu : ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter side: ");
                        double side = input.nextDouble();
                        calc.setSquare(side);
                        calc.run();
                        System.out.println("Square Area: " + calc.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter radius: ");
                        double radius = input.nextDouble();
                        calc.setCircle(radius);
                        calc.run();
                        System.out.println("Circle Area: " + calc.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter a: ");
                        double a = input.nextDouble();
                        System.out.print("Enter b: ");
                        double b = input.nextDouble();
                        System.out.print("Enter t: ");
                        double t = input.nextDouble();
                        calc.setTrapezoid(a, b, t);
                        calc.run();
                        System.out.println("Trapezoid Area: " + calc.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program End");
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Input must be a number");
                input.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Error" + e.getMessage());
            }
        } 
        while (repeat);
        input.close();
    }
}
