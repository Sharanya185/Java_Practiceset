package Placement;

import java.util.Scanner;

public class Fact {
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else if(num==1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int res=factorial(num);
		System.out.println(res);
		
		
	}

}

























































































