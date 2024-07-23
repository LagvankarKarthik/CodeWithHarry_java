package CWH;

import java.util.Scanner;

public class CWH_Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the mark of Subject 1: ");
    int mark1 = sc.nextInt();
    System.out.print("Enter the mark of Subject 2: ");
    int mark2 = sc.nextInt();
    System.out.print("Enter the mark of Subject 3: ");
    int mark3 = sc.nextInt();

    int total = mark1 + mark2 + mark3;
    float percentage = (total / 300.0f) * 100;

    System.out.println("The percentage is: " + percentage + "%");
  }
}