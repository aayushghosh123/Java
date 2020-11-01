
class School{
	int student;
	int teachers;
	int staff;
	
	School(){
		student=0;
		teachers=0;
		staff=0;
	}
	
	School(int x,int y,int z){
		student = x;
		teachers = y;
		staff = z;
	}
	
	void print_info() {
		System.out.println("Student = "+student+" Teachers = "+teachers+" Staff = "+staff);
	}
}

public class OverloadingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1 =new School();
		School s2 = new School(1,2,4);
		
		s1.print_info();
		s2.print_info();
	}

}
