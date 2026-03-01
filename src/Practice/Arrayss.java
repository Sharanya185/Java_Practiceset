// check the array is sorted in ascending order or not


package Practice;

import java.util.Scanner;

public class Arrayss {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter the size of array");
	    int size=sc.nextInt();
	    int numbers[]=new int[size];
	    System.out.println("enter the elements of array");
	    
	    for (int i=0;i<size;i++) {
	    	numbers[i]=sc.nextInt();
	    }
	    boolean isAscending=true;
	    for(int i=0;i<numbers.length-1;i++) {
	    	if(numbers[i]>numbers[i+1]){
	    		isAscending=false;
	    		break;
	    	}
	    	
	    }
	    if(isAscending) {
	    	System.out.println("numbers are in ascending  order");
	    }
	    else
	    	System.out.println("not in ascending order");
	}

}
