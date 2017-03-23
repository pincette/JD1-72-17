import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int i = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int j = sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int k = sc.nextInt();
		int z = 0;
		
		System.out.println("-----------------------------");
		System.out.println("numbers: "+i+", "+j+", "+k);

		System.out.println("=============================");
		if((i>j&&j>k)||(k>j&&j>i)) z=i+k;
		else if((i>k&&k>j)||(j>k&&k>i)) z=i+j;
		else if((j>i&&i>k)||(k>i&&i>j)) z=j+k;
		else System.out.println("some numbers are equal!"); 
		System.out.println("sum: "+z);
	}	
}
