import java.util.ArrayList;
import java.util.Arrays;

/**
 * The converted arraylist: [JAVA, Go, JS, C, C++]
 * The converted array:
 * Python
 * PHP
 * C#
 */

public class Exercise9 {
  public static void main(String[] args) {
    String[] myArray = new String[] { "JAVA", "Go", "JS", "C", "C++" };

    // 1. Convert String[] myArray to ArrayList<String> list by aslist() method
    // code here ...

    ////covent to arrqy by loop
    ArrayList<String> listByLoop = new ArrayList<>();
    for (int i = 0; i < myArray.length; i++) {
      listByLoop.add(myArray[i]);
    }

    ///convert to array by add.all and asList
    ArrayList<String> list = new ArrayList<>();
    list.addAll(Arrays.asList(myArray));

    System.out.println("The converted arraylist: " + list);

    // 2. Construct another ArrayList anotherList for conversion
    ArrayList<String> anotherList = new ArrayList<>();

    // and add Python, PHP, C# as list elements by add() method
    // code here ...
    anotherList.add("Python");
    anotherList.add("PHP");
    anotherList.add("C#");

    String[] myAnotherArray = new String[anotherList.size()];
    anotherList.toArray(myAnotherArray);
    // Convert List to Array by toArray() method

    System.out.println("The converted array: " + myAnotherArray);
    for (int i = 0; i < myAnotherArray.length; i++) {
      System.out.println(myAnotherArray[i]);
    }
    // Print out the String Array by for loop

  }
}