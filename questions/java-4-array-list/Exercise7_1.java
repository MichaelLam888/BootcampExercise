import java.util.Arrays;

/**
 * The sum is 55
 */
public class Exercise7_1 {
    // Sum values of an array
    public static void main(String[] args) {
      // Declare a int array, with value 1 to 10
      // code here
      int[] arr = new int[5]; 
      Arrays.fill(arr, 11);
      int sum = 0;
  
      
  
  
      // Write a loop to sum up all value in the int array, the result should be 55
      // code here
      for (int i = 0; i < arr.length ; i ++){
        sum += arr[i];
      }
  
      System.out.println("The sum is " + sum);
    }
  }