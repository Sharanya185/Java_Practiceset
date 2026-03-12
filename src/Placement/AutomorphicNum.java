package Placement;

public class AutomorphicNum {

	public static void main(String[] args) {
    int n=7;
    int square=n*n;
    int temp=n;
    boolean isAuto=true;
    while(temp>0) {
    	if(temp%10!=square%10) {
    		isAuto=false;
    		break;
    		
    	}
    	temp/=10;
    	square/=10;
    }
    if(isAuto) {
    	System.out.println("Automorphic number");
    }else {
    	System.out.println("not");
    }
	}

}
