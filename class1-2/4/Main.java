import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st integer number: ");
		int i = sc.nextInt();
		System.out.println("Enter 2nd integer number: ");
		int j = sc.nextInt();
		System.out.println("Enter operation sign: ");
		sc.nextLine();
		char s = sc.nextLine().charAt(0);

		System.out.println("-----------------------------");
		System.out.println("1st number: "+i);
		System.out.println("2nd number: "+j);
		System.out.println("symbol: "+s);

		System.out.println("=============================");
		if(s=='+'){
			System.out.println("result: "+(i+j));
			}
		else if(s=='-'){
			System.out.println("result: "+(i-j));
			}
		else if(s=='*'){
			System.out.println("result: "+(i*j));
			}
		else if(s=='/'&&j!=0){
			System.out.println("result: "+(float)i/j);
			}
		else System.out.println("divide by zero!");
	}	

}