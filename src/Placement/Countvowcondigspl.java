package Placement;

public class Countvowcondigspl {

	public static void main(String[] args) {
    String s="Hello@123";
    int vow=0,con=0,dig=0,spl=0;
    for(int i=0;i<=s.length()-1;i++) {
    	char ch=s.charAt(i);
    	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' ) {
    		vow++;
    	}
    	else if(ch>='0' && ch<='9') {
    		dig++;
    	}
    	else if((ch>='a' && ch<='z')||(ch>'A'&&ch<='Z')){
    		con++;
    	}
    	else {
    		spl++;
    	}
    }
    System.out.println("Vowels:"+vow+"Consonants"+con+"Special characters"+spl+"Digits"+dig);
	}

}
