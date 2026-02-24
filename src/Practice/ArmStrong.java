package Practice;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number:");
	    int num=sc.nextInt();
	  int og_num=num;
	    int temp=num;
	    int sum=0;
	    int count=0;
	    while(temp>0) {
	    	count++;
	    	temp/=10;
	    }
	    temp=num;
	    while(temp>0) {
	    	int digit=temp%10;
	    	sum+=Math.pow(digit, count);
	    	temp/=10;
	    	
	    }
	    if(og_num==sum) {
	    	System.out.println("Armstrong number");
	    }
	    else
	    	System.out.println("Not an Armstrong number");
	}

}

