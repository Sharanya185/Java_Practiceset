//Find the maximum and minimum number in an array of integers


package Practice;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int numbers[]=new int[size];
    System.out.println("enter the elements of array");
    
    for (int i=0;i<size;i++) {
    	numbers[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
     for(int i=0;i<numbers.length;i++) {
    	 if(numbers[i]<min) {
    		 min= numbers[i];
    	 }
    	 if(numbers[i]>max) {
    		 max=numbers[i];
    		 
    	 }
    	 
     }
     System.out.println("largest is "+max);
     System.out.println("min is "+min);
    		
	}

}
