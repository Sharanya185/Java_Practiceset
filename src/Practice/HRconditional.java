//Easy logic to remember
//
//Odd → Weird
//
//Even
//
//2–5 → Not Weird
//
//6–20 → Weird
//
//20 → Not Weird






package Practice;
import java.util.Scanner;

public class HRconditional {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the number");
		        int n = sc.nextInt();
		        if (n % 2 != 0) {
		            System.out.println("Weird");
		        } else {
		            if (n >= 2 && n <= 5) {
		                System.out.println("Not Weird");
		            } else if (n >= 6 && n <= 20) {
		                System.out.println("Weird");
		            } else {
		                System.out.println("Not Weird");
		            }
		        }
		    }
		
	

}
