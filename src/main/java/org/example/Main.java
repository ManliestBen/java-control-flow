package org.example;

public class Main {
    public static void main(String[] args) {

//        These turn into false when converting to Boolean:
//        false, 0, "", NaN, null, undefined

        int age = 42;
        boolean canBuyAlcohol = (age >= 21) ? true : false;

        if (canBuyAlcohol) {
            System.out.println("Have a beer!");
        } else {
            System.out.println("Have some milk!");
        }

        String color = "red";

        if (color.equals("red")) {
            System.out.println("Stop!");
        } else if (color.equals("yellow")) {
            System.out.println("Slow down!");
        } else {
            System.out.println("Go!");
        }

//      This can also be achieved using the switch statement

        switch(color) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Slow down!");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid entry");
        }

        for (int i = 1; i <= 101; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
