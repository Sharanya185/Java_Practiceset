//find the largest and smallest element in an array

package Placement;

public class LargeandSmall {

	public static void main(String[] args) {
    int[] arr= {1,78,6,9,5};
    int large=arr[0];
    int small=arr[0];
    for(int i=0;i<=arr.length-1;i++) {
    	if(arr[i]>large) {
    		large=arr[i];
    	}
    	if(arr[i]<small) {
    		small=arr[i];
    	}
    }
    System.out.println("large:"+large+" "+"Small:"+small);
	}

}
