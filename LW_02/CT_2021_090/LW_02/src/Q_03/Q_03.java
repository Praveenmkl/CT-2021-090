package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the temperature in degrees of Celsius: ");

        double cel = input.nextDouble();
        double fah = (1.8 * cel) + 32;

        System.out.printf("Temperature in degrees of Fahrenheit: %.2f" ,fah );
    }
}
