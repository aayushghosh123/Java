import java.util.Scanner;
public class Practice8 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	String[] arr = new String[n];
	
	for(int i=0;i<n;i++) {
		arr[i] = input.nextLine();
	}
	
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	}
}