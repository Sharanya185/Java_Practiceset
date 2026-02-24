package Placement;

import java.util.Scanner;

public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number:");
	    int num=sc.nextInt();
	    int og_num=num;
	    int reverse=0;
	    while(num>0) {
	    	int digit=num%10;
	        reverse=reverse*10+digit;
	        num/=10;
	    	
	    
		}
	    System.out.println(reverse);
	}

}
