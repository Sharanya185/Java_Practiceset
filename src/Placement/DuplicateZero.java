package Placement;

import java.util.Scanner;

public class DuplicateZero {
	public static void duplicateZero(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				for(int j=nums.length-1;j>i;j--) {
					nums[j]=nums[j-1];
				}
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size:" );
		int n=sc.nextInt();
		int[] nums=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		duplicateZero(nums);
		System.out.println("array ater suplicating zeros");
		for(int i=0;i<n;i++) {
			System.out.println(nums[i]);
		}
	}

}
