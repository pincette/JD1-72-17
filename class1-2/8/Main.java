import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the month (correctly): ");
		String s = sc.nextLine();
		
		System.out.println("-----------------------------");
		System.out.println("the month: "+s);

		System.out.println("=============================");
		if(s.equals("january")||s.equals("february")||s.equals("december"))
					System.out.println("the season: winter"); 
		else if(s.equals("march")||s.equals("april")||s.equals("may"))
					System.out.println("the season: spring");
		else if(s.equals("june")||s.equals("july")||s.equals("august"))
					System.out.println("the season: summer");
		else if(s.equals("september")||s.equals("october")||s.equals("november"))
					System.out.println("the season: autumn");
		else System.out.println("please spell it correctly next time!");
	}	

}