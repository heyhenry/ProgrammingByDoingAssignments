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

            if(formula < 15.0) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Very severely underweight");

            } else if (formula >= 15.0 && formula <= 16.0) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Severely underweight");

            } else if (formula >= 16.1 && formula <= 18.4) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Underweight");

            } else if (formula >= 18.5 && formula <= 24.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Normal weight");

            } else if (formula >= 25.0 && formula <= 29.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Overweight");

            } else if (formula >= 30.0 && formula <= 34.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Moderately obese");

            } else if (formula >= 35.0 && formula <= 39.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Severely obese");

            } else if (formula >= 40.0) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Very severely obese");

            }

        } else if (measurementType.equalsIgnoreCase("B")) {

            System.out.println("Your height in m: ");
            height = sc.nextDouble();

            System.out.println("Your weight in kg: ");
            weight = sc.nextInt();

            formula = weight / Math.pow(height, 2);

            if(formula < 15.0) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Very severely underweight");

            } else if (formula >= 15.0 && formula <= 16.0) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Severely underweight");

            } else if (formula >= 16.1 && formula <= 18.4) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Underweight");

            } else if (formula >= 18.5 && formula <= 24.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Normal weight");

            } else if (formula >= 25.0 && formula <= 29.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Overweight");

            } else if (formula >= 30.0 && formula <= 34.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Moderately obese");

            } else if (formula >= 35.0 && formula <= 39.9) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Severely obese");

            } else if (formula >= 40.0) {

                System.out.printf("%s%.5f%n", "Your BMI is: ", formula);
                System.out.println("BMI Category: Very severely obese");

            }

        }


    }

}
