package Placement;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number:");
	    int num=sc.nextInt();
	    int count=0;
	    while(num>0) {
	    	count++;
	    	num/=10;
	    }
	    System.out.println(count);
	}

}
