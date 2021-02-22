import java.util.Scanner;

public class HansDekkers2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please insert the first number: ");
    int a = input.nextInt();
    System.out.print("Please insert the second number: ");
    int b = input.nextInt();

    // Computing the maximum to be fed to the evaluation function
    int min = a < b ? a : b;
    int max = a < b ? b : a;

    // Feeding the evaluation function
    for (int i = 0; i <= 1000; i++) System.out.println(evalNumber(i, min, max));
  }

  /**
   * Returns the evaluated string to output based on the number N. Rules that
   * apply: if N is divisible by both a and b it returns "HANS DEKKERS", "DEKKERS"
   * if divisible by b and "HANS" if divisible by a. Default: the number in string repr.
   *
   * @param n number to evaluate
   * @param a minimum divisor test
   * @param b maximum divisor test
   *
   * @returns evaluated string
   */
   public static String evalNumber(int n, int a, int b) {
     String eval = Integer.toString(n);
     if (n % a == 0 && n % b == 0) eval = "HANS DEKKERS";
     else if (n % b == 0) eval = "DEKKERS";
     else if (n % a == 0) eval = "HANS";
     return eval;
   }

}
