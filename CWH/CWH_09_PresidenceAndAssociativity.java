package CWH;

public class CWH_09_PresidenceAndAssociativity {
  public static void main(String[] args) {
    // Precidence and associativity in Java
    float a = 24f, b = 48f, c = 2f;
    float d = (a * b + c / a); // Associativity is left to right for this. And so is for the below one.
    float e = (a / b - a / c);

    System.out.println(d);
    System.out.println(e);
  }
}