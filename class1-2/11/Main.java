import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s; Boolean m;
		do {
			System.out.println("Enter some char: ");
			s = sc.next();
			m = s.matches("(.*)q(.*)");
			}
		while (!m);
		System.out.println("\"q\" is detected! quitting...");
	}	
}
