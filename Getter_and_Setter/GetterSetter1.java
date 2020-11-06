import java.util.Scanner;

class GetsandSets{
	private int data;
	
	int getterdata() {
		return this.data;
	}
	
	void setterdata(int num){
		if (num < 10 || num > 100) {
	        throw new IllegalArgumentException();
	    }
	    this.data = num;
	}
}

public class GetterSetter1 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
	
	GetsandSets gs = new GetsandSets();
	
	int data = it.nextInt();
	it.close();
	
	gs.setterdata(data);
	
	gs.getterdata();
	}

}
