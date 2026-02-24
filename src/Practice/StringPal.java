package Practice;

import java.util.Scanner;

public class StringPal {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String str=sc.next();
    String reverse="";
    for(int i=str.length()-1;i>=0;i--) {
    	reverse+=str.charAt(i);
    }
    if(str.equals(reverse)) {
    	System.out.println("It is a palindrome");
    }
    else {
    	System.out.println("NoT a pAlINDRoME");
    }
	}

}
