import java.util.Scanner;

public class Main {
	// check if result string is valid shuffle of string first and second
	  static boolean shuffleCheck(String first, String second, String result) {

	    // check length of result is same as
	    // sum of result of first and second
	    if(first.length() + second.length() != result.length()) {
	      return false;
	    }
	    // variables to track each character of 3 strings
	    int i = 0, j = 0, k = 0;

	    // iterate through all characters of result
	    while (k != result.length()) {

	      // check if first character of result matches with first character of first string
	      if (i < first.length() && first.charAt(i) == result.charAt(k))
	        i++;

	      // check if first character of result matches the first character of second string
	      else if (j < second.length() && second.charAt(j) == result.charAt(k))
	        j++;

	      // if the character doesn't match
	      else {
	        return false;
	      }

	      // access next character of result
	      k++;
	    }

	    // after accessing all characters of result
	    // if either first or second has some characters left
	    if(i < first.length() || j < second.length()) {
	      return false;
	    }

	    return true;
	  }

	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first input");
        String first = sc.nextLine();
       // sc.nextLine();
        System.out.println("Enter second input");
        String second= sc.nextLine();
       // sc.nextLine();
        System.out.println("Enter result you want answer");
        String results=sc.nextLine();
        //sc.nextLine();
	    //String first = "abc";
	   // String second = "def";
	   // String[] results = {"dabecf", "abcdef"};

	    // call the method to check if result string is
	    // shuffle of the string first and second
	    //for (String result : results) {
	      if (shuffleCheck(first, second, results) == false) {
	        System.out.println(results + " is a valid shuffle of " + first + " and " + second);
	      }
	      else {
	        System.out.println(results + " is not a valid shuffle of " + first + " and " + second);
	      }
	   // }
	  }
}
