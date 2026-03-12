package Placement;

import java.util.Arrays;
import java.util.Scanner;

public class Twosum {
	public static int[] twosum(int[] nums,int target) {
		int i=0;
		int j=nums.length-1;
		while(i<j) {
			int sum=nums[i]+nums[j];
			if(sum==target) {
				return new int[] {i,j};
			}
			else if(sum<target) {
				i++;
			}
			else {
				j--;
			}
		}
		return new int[] {};
}
public static void main(String[] args) {
	int[] nums= {1,2,3,4,5};
	int target=5;
	int[] res=twosum(nums,target);
	System.out.println(Arrays.toString(res));
	
}
}