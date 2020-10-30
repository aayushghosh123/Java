import java.util.Scanner;
public class Practice7 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = input.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}
}
