package Placement;

import java.util.Scanner;

public class Palindromestr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a String:");
	    String str=sc.next();
	    String reversed="";
	    for (int i=str.length()-1;i>=0;i--) {
	    	reversed+=str.charAt(i);
	    }
	    if(str.equals(reversed)) {
	    	System.out.println("Palindrome");
	    }
	    else{
	    	System.out.println("not palindRoME");
	    	
	    }
	}

}
