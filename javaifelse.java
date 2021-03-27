// Problem IF Else in Java


package hackerProblems;
import java.util.Scanner;

public class javaIfElse {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o número inteiro: ");
		
		int n = scan.nextInt();
		
		
		
		if((n % 2 == 0) && (n >= 2 && n <= 5)){
			System.out.println("The number is NOT WEIRD");
		}
		if((n % 2 == 0) && (n >= 6 && n <= 20)) {
			System.out.println("Weird");
		}
		if(n % 2 != 0) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Not Weird");
		}
		
	}

}
