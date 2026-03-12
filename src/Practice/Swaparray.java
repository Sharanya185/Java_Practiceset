package Practice;
import java.util.Arrays;
public class Swaparray {

	public static void main(String[] args) {
     int[] nums= {10,20,30,40};
     int i=0;
     int j=nums.length-1;
     while(i<j) {
    	 int temp=nums[i];
    	 nums[i]=nums[j];
    	 nums[j]=temp;
    	 i++;
    	 j--;
     }
    	 System.out.println(Arrays.toString(nums));
    	 
     }
	}

