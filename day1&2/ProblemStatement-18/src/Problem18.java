import java.util.HashMap;
import java.util.Scanner;

public class Problem18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replace("(", "").replace(")", "");
		String[] ar = input.split(",");
		System.out.println(fractionToDecimal(Integer.parseInt(ar[0]),Integer.parseInt(ar[1])));
	}

	 public static String fractionToDecimal(int numerator, int denominator) {
	        StringBuilder ans = new StringBuilder();
	    	if((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
	    		ans.append('-');
	    	long num = Math.abs((long)numerator);
	    	long den = Math.abs((long)denominator);
	        long quo = num / den;
	        long rem = num % den;
	        ans.append(quo);
	        if(rem == 0)
	        	return ans.toString();
	        else {
	        	ans.append(".");
		    	HashMap<Long, String> map = new HashMap<>();
	            rem = Math.abs(rem);
		    	while(rem != 0) {
		    		if(map.containsKey(rem)) {
		    			int size = map.get(rem).length();
		    			ans.insert(size, "(");
		    			ans.append(")");
		    			return ans.toString();
		    		}else
		    			map.put(rem, new String(ans + ""));
		        	rem *= 10;
		        	quo = rem / den;
		        	rem = rem % den;
	                rem = Math.abs(rem);
		        	ans.append(quo);
		        }
		        return ans.toString();
	        }
	    }
}
