package Placement;

public class HarshadNum {

	public static void main(String[] args) {
     int n=18;
     int temp=n;
     int sum=0;
     while(temp>0) {
    	 int digit=temp%10;
    	 sum+=digit;
    	 temp/=10;
    	 
    	 
     }
     if(n%sum==0) {
    	 System.out.println("harshad number");
     }
     else {
    	 System.out.println("not");
     }
	}

}
