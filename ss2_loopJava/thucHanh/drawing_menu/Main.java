package ss2_loopJava.thucHanh.drawing_menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triang le ");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6 - i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square ");
                    for (int i = 1; i <= 6; i++) {
                        for (int j=1;j<=6;j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle ");
                    for (int i = 1; i <= 3; i++) {
                        for (int j=1;j<=6;j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }

    }
}
