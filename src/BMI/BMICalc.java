package BMI;

import java.util.Scanner;

public class BMICalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double height;
        int weight;
        int feet;
        int inches;
        double formula;

        System.out.println("Imperial (A) or Metric (B): ");
        String measurementType = sc.nextLine();

        if(measurementType.equalsIgnoreCase("A")) {

            System.out.println("Your height (feet only): ");
            feet = sc.nextInt();

            System.out.println("Your height (inches): ");
            inches = sc.nextInt();

            System.out.println("Your weight in pounds: ");
            weight = sc.nextInt();

            inches = inches + (feet * 12);
            formula = 703 * weight / Math.pow(inches, 2);

            System.out.printf("%s%.5f", "Your BMI is: ", formula);

        } else if (measurementType.equalsIgnoreCase("B")) {

            System.out.println("Your height in m: ");
            height = sc.nextDouble();

            System.out.println("Your weight in kg: ");
            weight = sc.nextInt();

            formula = weight / Math.pow(height, 2);

            System.out.printf("%s%.5f", "Your BMI is: ", formula);

        }


    }

}
