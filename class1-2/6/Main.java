import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single integer number (0..9): ");
		int i = sc.nextInt();
		System.out.println("-----------------------------");

		System.out.println("the number: "+i);
		System.out.println("=============================");

		if (i<0|i>9) {System.out.println("the number is too large (or too small)!"); }
		else
			if ((float)i%2==0) {
				System.out.println("the number is even"); }
			else {
				System.out.println("the number is odd"); }
			}
	}	

