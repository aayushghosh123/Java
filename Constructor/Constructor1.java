//Here we are going to use Constructor

import java.util.Scanner;

class Box{
	int length;
	int breath;
	int height;
	
	Box() {               // This is Constructor
	length = 0;
	breath = 0;
	height=0;}
	
	void volume() {
		System.out.print(length*breath*height);
	}	
}

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		
		Box b1 = new Box();
		System.out.print("The volume before constructor initial values are changed ");
		b1.volume();
		
		System.out.println();
		
		b1.breath = i.nextInt();
		b1.height = i.nextInt();
		b1.length = i.nextInt();
		
		System.out.print("The volume after constructor initial values are changed ");
		
		b1.volume();		
	}

}
