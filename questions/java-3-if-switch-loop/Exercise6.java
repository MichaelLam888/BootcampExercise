import java.util.Scanner;

/*
Expected Output: (When input = 4)
   *
  ***
 *****
*******
 *****
  ***
   *
Expected Output: (When input = 7)
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
public class Exercise6 {

  public static void main(String[] args) {
    int i, j, r;

    System.out.print("Input number of rows (half of the diamond) : ");
    Scanner in = new Scanner(System.in);
    r = in.nextInt();

    // upper loop
    for (i = 0; i < r; i++) {

      // left "space "start
      for (int x = i; x < r; x++) {
        System.out.print(' ');
      }
      // left "space " end

      // left "*" start
      for (j = i; j >= 0; j--) {
        System.out.print('*');
      }
      // left "*" end

      // right "*" start
      for (j = i; j > 0; j--) {
        System.out.print('*');
      }
      // right "*" end
      System.out.println();

    }

 
    // lower loop
    for (i = 0; i < r; i++) { 
      // right "*" start
      for (j = i; j > 0; j--) {
        System.out.print('#');
      }
      // right "*" end
     
    }
    System.out.println();
    // Upper Part: increasing parttern
    // Think about how to print " " and "*"
    // and when to new line

    // Lower Part: decreasing parttern
    // Think about how to print " " and "*"
    // and when to new line

  }
}
