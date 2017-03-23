import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single integer number (0..9): ");
		int i = sc.nextInt();
		
		System.out.println("-----------------------------");
		System.out.println("the number: "+i);

		System.out.println("=============================");
		if (i<=9&&i>=0) {
			switch(i) {
				case 0: {
					System.out.println("name of the number: null");
					break; }
				case 1: {
					System.out.println("name of the number: one");
					break; }
				case 2: {
					System.out.println("name of the number: two");
					break; }
				case 3: {
					System.out.println("name of the number: three");
					break; }
				case 4: {
					System.out.println("name of the number: four");
					break; }
				case 5: {
					System.out.println("name of the number: five");
					break; }
				case 6: {
					System.out.println("name of the number: six");
					break; }
				case 7: {
					System.out.println("name of the number: seven");
					break; }
				case 8: {
					System.out.println("name of the number: eight");
					break; }
				case 9: {
					System.out.println("name of the number: nine");
					break; }
				}
		}
		else System.out.println("the number is too large (or too small)!");
	}	

}