package CWH;

import java.util.Scanner;

public class CWH_PracticeSet1 {
  public static void main(String[] args) {
    // Question 1
     * int aa = 10;
     * int ab = 20;
     * int ac = 76;
     * int sum = aa + ab + ac;
     * System.out.print("The sum of the numbers 10, 20 and 76 is: " + sum);

    // Question 2
     * int ba = 90, bb = 77, bc = 89;
     * float avg = (ba + bb + bc) / 30f;
     * System.out.println("The CGPA of the student is: " + cgpa);
     

    // Question 3
    Scanner sc = new Scanner(System.in);
    System.out.print("WHat is your name mate? ");
    String name = sc.nextLine();
    System.out.println("Hello " + name + " have a good day!");

    //Question 5
    System.out.print("WEnter a number here mate: ");
    String num = sc.hasNextInt();
    System.out.println("If you are wondering if you have entered a number or not, the answer is: " + num);
  }
}