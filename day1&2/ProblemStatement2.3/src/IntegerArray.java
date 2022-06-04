import java.util.ArrayList;
import java.util.Arrays;

public class IntegerArray {  
    public static void main(String[] args) {  
        //Initialize array  
        Integer [] arr = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, };  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum); 
        System.out.println();
        //find avg
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("average of all elements in array : "+average);


        
        
        int n = arr.length;  
        int newArr[] = new int[n+1];  
        int value = sum;  
        
        System.out.println("array"+Arrays.toString(arr));  
        
        for(int i = 0; i<n; i++) {  
        newArr[i] = arr[i];  
        }  
        newArr[n] = value;  
        
        System.out.println("after adding sum into array: "+Arrays.toString(newArr)); 
        System.out.println();
        
        int n1 = newArr.length;  
       int[] newArr1 = new int[n1+1];  
        double value1 = average;   
        
        for(int i = 0; i<n1; i++) {  
        	newArr1[i] = newArr[i];  
        }  
        newArr1[n1] = (int) value1;  
        
        System.out.println("after adding average  into array: "+Arrays.toString(newArr1)); 
     System.out.println();
     
     
   //find smallest element
     Arrays.sort(arr);
     int res = arr[0];
     System.out.println("smallest element is ::"+res);
     
        int n2 = newArr1.length;  
        int[] newArr2 = new int[n2+1];  
        int value2 = res;   
        
        for(int i = 0; i<n2; i++) {  
        	newArr2[i] = newArr1[i];  
        }  
        newArr2[n2] = value2;  
        
        System.out.println("after adding smallest number into array: "+Arrays.toString(newArr2)); 
        
    }  
}  