import java.util.Scanner;

class Volume{
	int height;
	int breath;
	int length;
	
	Volume(){
		length=0;
		breath=0;
		height=0;
	}
	
	void print_value() {
		System.out.println("Length = "+length+" Breath = "+breath+" Height = "+height);
	}
	
	void print_value(int l,int h,int b) {
		this.length = l;
		this.breath = b;
		this.height = h;
		System.out.println("Length = "+length+" Breath = "+breath+" Height = "+height);
	}
}

public class Thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		
		Volume v1 = new Volume();
		
		v1.print_value();
		
		v1.breath = i.nextInt();
		v1.length = i.nextInt();
		v1.height = i.nextInt();
		
		v1.print_value(v1.breath,v1.height,v1.length);
		
		//System.out.print(v1.length);
	}

}
