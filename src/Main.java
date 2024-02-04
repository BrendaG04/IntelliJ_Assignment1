//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Variables store data and each has specific data type
        int age = 25;
        double salaray = 50000.0;
        String name = "John";

        //For loop- repeats a block of code a specified number of times
        for (int i = 0; i < 5; i++) {
            System.out.println("ITERATION:" + i);
        }

        //While loop- continues executing a block of code as long as a condition is true.
        int count = 0;
        while (count < 3) {
            System.out.println("Count:" + count);
            count++;
        }

        //DoWhile loop- executes the code block at least once before checking the condition.
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);


        //If Statements
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        //If-Else statement
        int num2 = 7;
        if (num2 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        //Nested IF-else
        int age1=15;
        if (age1>=18) {
            if (age1 < 21) {
                System.out.println("You're eligible but not for alcohol");
             } else {
                System.out.println("You're eligible for everything");
                    }
             } else {
            System.out.println("You're not eligible");
                    }
        //Switch Case
        int day = 2;
        switch (day) {
             case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;
             default:
                System.out.println("Invalid day");
        }
    }
}