package CWH;

import java.util.Scanner; //Importing java scanner class. Here we vhave imported some external codes.

public class CWH_05_UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = sc.next();
    System.out.print("Hello " + name + " Enter a number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter another number: ");
    int num2 = sc.nextInt();

    int sum = num1 + num2;

    System.out.println("The sum of the two numbers hat you have entered is: " + sum);
  }
}