import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s; Boolean m;
		do {
			System.out.println("Enter some chars: ");
			s = sc.nextLine();
			m = s.matches("stop");
			}
		while (!m);
		System.out.println("stopping...");
	}	
}
