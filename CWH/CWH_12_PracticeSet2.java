package CWH;

import java.util.Scanner;

public class CWH_12_PracticeSet2 {
  public static void main(String[] args) {
    // Question 1: What is the result of the following expression?

    float a1 = 7 / 4.0f * 9 / 2.0f;
    System.out.println(a1);

    // Encrypt a grade by adding 8 to it. Decrypt it to show the correct answer.

    char grade = 'A';
    grade = (char) (grade + 8);
    System.out.println(grade);

    // Program to determine if the numebr given by the user is greater than or less
    // than given number
    int g = 13;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number please: ");
    int a = sc.nextInt();
    if (g > a) {
      System.out.println("The number you have entered is lesser than the given number.");
    } else if (g < a) {
      System.out.println("The number you have entered is greated than the given number.");
    } else {
      System.out.println("The number that you have entered is equal to the given number.");
    }
  }
}