//Find the frequency of each element in an array

package Placement;

public class Frqelem {

	public static void main(String[] args) {
    int[] arr= {2,4,5,5,4,7,5,8};
    int n=arr.length;
    boolean[] visited=new boolean[n];
    for(int i=0;i<n;i++) {
    	if(visited[i])
    		continue;
    	int count=1;
    	for(int j=i+1;j<n;j++) {
    		if(arr[i]==arr[j]) {
    			count++;
    			visited[j]=true;
    		}
    	}
    
    System.out.println(arr[i]+"->"+count);
    
    
	}
	}
}
