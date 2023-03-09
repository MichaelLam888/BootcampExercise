import java.util.Scanner;

/**
 * Input number of rows : 5
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class Exercise5 {

  public static void main(String[] args) {
    int i, j, n;
    System.out.print("Input number of rows : ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    for (i = 1, j = 1; i <= n; i++) { // i = loop time , n = enter value
      System.out.print(j);
      for (int x = 1; x < i; x++) { // i = first loop , n = enter value , x = second loop counter
        System.out.print(x + 1);
      }
      System.out.println();
    }

    // Use a for loop with nested loop
    // Use System.out.println to enter next line
    // Use System.out.print to print output, without entering to next line

  }
}

/**
 * Input number of rows : 5
 * 1 n
 * 12 n + n+1
 * 123 n + n+1 + n+2
 * 1234
 * 12345
 */