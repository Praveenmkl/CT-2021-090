package Q_02;

import java.util.Scanner;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length in Centimeters: ");
        double cm = sc.nextDouble();

        // Convert feet to inches
        int feet = (int) (cm / 30.48);
        double remainder = cm % 30.48;
        double inch = remainder / 2.54;


        System.out.printf("Entered length in feet and inches: %d ft and %.2f inch%n", feet, inch);


    }
}
