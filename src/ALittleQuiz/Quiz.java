package ALittleQuiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String choice;
        int counter = 0;

        while(true) {

            System.out.print("Are you ready? ");
            String isReady = sc.nextLine();

            if (isReady.equalsIgnoreCase("Yes")) {

                System.out.println("Q1. What is the capital of Western Australia? ");
                System.out.println("[A] Melbourne");
                System.out.println("[B] Perth");
                System.out.println("[C] Adelaide");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("B")) {

                    counter++;
                    System.out.println("You got it right!");

                } else {

                    System.out.println("Oops, " + choice.toUpperCase() + " wasn't the right choice.");

                }

                System.out.println();
                System.out.println("Q2. What is the currency called in Armenia? ");
                System.out.println("[A] Rouble");
                System.out.println("[B] Yen");
                System.out.println("[C] Dram");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("C")) {

                    counter++;
                    System.out.println("You got it right!");

                } else {

                    System.out.println("Oops, " + choice.toUpperCase() + " wasn't the right choice.");

                }

                System.out.println();
                System.out.println("Q3. Who is the author of Harry Potter?");
                System.out.println("[A] J. K. Rowling");
                System.out.println("[B] Neil Gaiman");
                System.out.println("[C] N. K. Jemisin");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("A")) {

                    counter++;
                    System.out.println("You got it right!");

                } else {

                    System.out.println("Oops, " + choice.toUpperCase() + " wasn't the right choice.");

                }

                System.out.println("Overall, you got " + counter + " out of 3 correct.");

                break;

            } else if (isReady.equalsIgnoreCase("No")) {

                System.out.println("Oh okay, maybe another time.");

                break;

            } else {

                System.out.println("Looks like your answer strayed off topic! Please give a yes or no.\n");

            }

        }

    }

}
