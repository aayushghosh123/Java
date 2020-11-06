import java.util.Scanner;

class Getandset{
	private int a = 10;
	
	int getterdata(){
		return this.a;
	}
	
	void setterdata(int data){
		this.a = data;
	}
}

public class GetterSetter {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Getandset gs = new Getandset();
		
		int data = s.nextInt();
		
		gs.setterdata(data);
		
		System.out.print(gs.getterdata());
	}

}
