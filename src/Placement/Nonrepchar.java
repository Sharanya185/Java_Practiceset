package Placement;

public class Nonrepchar {

	public static void main(String[] args) {
    String str="eesrs";
    int[] freq=new int[256];
    for(int i=0;i<=str.length()-1;i++) {
    	freq[str.charAt(i)]++;
    }
    for(int i=0;i<=str.length()-1;i++) {
    	if(freq[str.charAt(i)]==1) {
    		System.out.println(str.charAt(i));
    		break;
    	}
    }
	}

}
