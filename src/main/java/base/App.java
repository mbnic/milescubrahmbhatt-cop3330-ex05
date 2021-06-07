/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    static Operations answers = new Operations();

    public static void main(String[] args) {
        App myApp = new App();
        Number first = new Number();
        Number second = new Number();

        myApp.readValues(first, second);
        myApp.performOperations(first, second);
        String output = myApp.generateOutput(first, second);
        myApp.printOutput(output);
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public String generateOutput(Number first, Number second) {
       return String.format(

               (first.stringValue + " + " + second.stringValue + " = " + answers.add)
               + ("\n" + first.stringValue + " - " + second.stringValue + " = " + answers.sub)
               + ("\n" + first.stringValue + " * " + second.stringValue + " = " + answers.multi)
               + ("\n" + first.stringValue + " / " + second.stringValue + " = " + answers.division)
       );
    }

    public void performOperations(Number first, Number second) {
        answers.add = first.intValue + second.intValue;
        answers.sub = first.intValue - second.intValue;
        answers.division = first.intValue / second.intValue;
        answers.multi = first.intValue * second.intValue;
    }

    public void readValues(Number first, Number second) {
        System.out.printf("What is the first number? ");
        first.stringValue = in.nextLine();
        first.intValue = Integer.parseInt(first.stringValue);

        System.out.printf("What is the second number? ");
        second.stringValue = in.nextLine();
        second.intValue = Integer.parseInt(second.stringValue);
    }

}
