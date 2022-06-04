import java.util.Scanner;

public class Stairs {
	static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
   
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
    
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of stairs");
    	int a = sc.nextInt();
    	
       // int s = 2;
        System.out.println("Number of ways = " + countWays(a));
    }
}
