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
    for (i = 0; i < r; i++) {  //start every row by input r , eg r = 4 , i = 0 start , 0 < 4 , run 0,1,2,3  = 4 times

      // left "space "start
      for (int x = i; x < r; x++) { //print space but doesn't change the i , x = 0 , 0 < 4 --  0,1,2,3 = 4 times , 3 times , 2 times , 1 time  "space"
        System.out.print(' ');
      }
      // left "space " end

      // left "*" start
      for (j = i; j >= 0; j--) { //print * left side , j = 0 , 0 >= 0 , 0,1,2,3 , 1 time ,2 times , 3 times , 4,times
        System.out.print('A');
      }
      // left "*" end

      // right "*" start
      for (j = i; j > 0; j--) { //print # right side , j = 0 , 0 > 0 , 1,2,3 , 0 time , 1 time ,2 times , 3 times
        System.out.print('A');
      }
      // right "*" end
      System.out.println();

    }

    // lower loop
    for (i = 1; i <= r; i++) {  // print lower side,  i = 1 , 1 <= 4 , 1,2,3,4 = 4 times

      for (j = i; j >= 0; j--) {  //print space j = 1 , 1 >= 0 , 1,2,3,4,  = 1 time , 2t , 3t , 4t
        System.out.print(" ");
      }

      for (j = i + 1; j < r; j++) { // print left % , j = 2 , 2 < 4 ,2 , 3 .....= ** then *
        System.out.print('V');
      }

      for (j = i + 1; j <= r; j++) { // print left % , j = 2 , 2 <= 4 ,2 , 3,4 .....= *** then ** then *
        System.out.print('V');
      }
      System.out.println();
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

