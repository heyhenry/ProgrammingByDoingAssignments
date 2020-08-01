package OneShotHiLo;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Random rand = new Random();

        int randomNo = rand.nextInt(100);

        System.out.println("I'm thinking of a number between 1 - 100. Try to guess it.");
        int num = sc.nextInt();


        if(num == randomNo) {

            System.out.println("You guessed it! What are the odds?");

        } else if (num < randomNo) {

            System.out.println("Sorry, you are too low. I was thinking of " + randomNo);

        } else {

            System.out.println("Sorry, you are too high. I was thinking of " + randomNo);

        }

        System.out.println("Random no was: " + randomNo);
    }

}
