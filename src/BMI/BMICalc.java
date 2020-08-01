package BMI;

import java.util.Scanner;

public class BMICalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double height;
        int weight;
        int feet;
        double formula;

        System.out.println("Your height in m: ");
        height = sc.nextDouble();

        System.out.println("Your weight in kg: ");
        weight = sc.nextInt();

        formula = weight / Math.pow(height, 2);

        System.out.printf("%s%.5f", "Your BMI is: ", formula);


    }

}
