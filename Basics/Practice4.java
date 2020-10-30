import java.util.Scanner;
public class Practice4 {
	
	public static void main(String []args) {
	
	Scanner input = new Scanner(System.in);
	
	int n = input.nextInt();
	
	while(n>0) {
		System.out.println("You are printing n :- "+n+" times");
		n--;
	}
}
}