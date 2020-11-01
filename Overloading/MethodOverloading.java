import java.util.Scanner;

class Findarea{
	int length;
	int breath;
	
	Findarea(){
		length=0;
		breath=0;
	}
	
	void find_area() {
		System.out.println("No Input!!, means no area");
	}
	
	void find_area(int length,int breath) {
		System.out.println("The area is :- "+length*breath);
	}
	
	void find_area(int length,int breath,int height) {
		System.out.println("The Volume is :- "+length*breath*height);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner i = new Scanner(System.in);
		
		Findarea fa = new Findarea();
		
		fa.find_area();
		
		fa.length = i.nextInt();
		fa.breath = i.nextInt();
		
		fa.find_area(fa.length,fa.breath);
		
		fa.length = i.nextInt();
		fa.breath = i.nextInt();
		
		fa.find_area(fa.length,fa.breath,10);		
	}

}
