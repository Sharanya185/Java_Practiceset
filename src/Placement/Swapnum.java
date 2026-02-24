package Placement;
import java.util.Scanner;
public class Swapnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter a number:");
		    int a=sc.nextInt();
		    System.out.println("enter another number:");
		    int b=sc.nextInt();
		    a=a+b;
		    b=a-b;
		    a=a-b;
		    System.out.println("after swapping  "+"a="+a+" "+"b="+b);
	}

}
