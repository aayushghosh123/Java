import java.util.Scanner;
public class Practice10 {
	public static void main(String[]args) {
		Scanner input  = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
}