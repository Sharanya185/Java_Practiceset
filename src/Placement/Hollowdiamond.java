package Placement;

import java.util.Scanner;

public class Hollowdiamond {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER A NUMBER");
  int n=sc.nextInt();
  int num=1;
  for(int i=1;i<=n;i++) {
	  for(int space=1;space<=n-i;space++) {
		  System.out.print(" ");
		  
	  }
	  for(int j=1;j<=2*i-1;j++) {
		  if(j==1||j==2*i-1) {
			  System.out.print(num+"");
			  num++;
		  }
		  else {
			  System.out.print(" ");
			  
		  }
		  
	  }
	  System.out.println();
  }
  for(int i=n-1;i>=1;i--) {
	  for(int space=1;space<=n-i;space++) {
		  System.out.print(" ");
		  
	  }
	  for(int j=1;j<=2*i-1;j++) {
		  if(j==1||j==2*i-1) {
			  System.out.print(num+"");
			  num++;
		  }
		  else {
			  System.out.print(" ");
			  
		  }
		  
	  }
	  System.out.println();
  }
  
	}

}
