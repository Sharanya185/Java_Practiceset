package Placement;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String[] args) {
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
    if(og_num==reverse) {
    	System.out.println("Palindrome");
    }
    else {
    	System.out.println("not a palindrome");
    }
    }

}
