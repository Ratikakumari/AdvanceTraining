import java.util.Scanner;

class Even_Numbers {

  public static void main(String args[]) {

  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the n value : ");
  
  int n = scan.nextInt();

  for (int i = 1; i <= n; i++) {

   if (i % 2 == 0) {

  System.out.print(i + " ");

   }

   }

  }

}