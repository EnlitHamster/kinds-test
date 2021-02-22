import java.util.Scanner;

public class HansDekkers1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();

    int min = a < b ? a : b;
    int max = a < b ? b : a;

    for (int i = 0; i <= 1000; i++)
      if (i % a == 0 && i % b == 0) System.out.println("HANS DEKKERS");
      else if (i % b == 0) System.out.println("DEKKERS");
      else if (i % a == 0) System.out.println("HANS");
      else System.out.println(i);
  }

}
