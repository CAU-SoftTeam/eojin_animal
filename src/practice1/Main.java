package practice1;
import java.util.Scanner;

abstract class animal{
	String name;
	int age;
	String gender;
			Scanner scan=new Scanner(System.in);

	public void get_info() {
		name=scan.nextLine();
		age=scan.nextInt();
		gender=scan.nextLine();
	}
	
	public void prt_info(){
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n성별 : "+gender);
	}
}

class dog extends animal{
	String food;
	
	public void get_info(String name, int age, String gender, String food) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.food = food;
	}
	
	public void prt_info(){
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n성별 : "+gender+ "\n먹이 : "+food);
	}
}

class cat extends animal{
	String arch;
	
	public void get_info(String name, int age, String gender, String arch) {
		super.get_info();
		this.arch = arch;
	}
	
	public void prt_info(){
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n성별 : "+gender+ "\n건물 : "+arch);
	}
}

public class Main {
	
	public static void main(String[] args) {
		dog t1 = new dog();
		dog t2 = new dog();
		cat s1 = new cat();
		cat s2 = new cat();
		
		t1.get_info("멍멍이", 3, "남", "뼈다귀");
		t2.get_info("댕댕이", 5, "여", "사료");
		s1.get_info("냥냥이", 6, "남", "캣타워");
		s2.get_info("야옹이", 2, "여", "배변함");
		
		t1.prt_info();
		System.out.println();
		t2.prt_info();
		System.out.println();
		s1.prt_info();
		System.out.println();
		s2.prt_info();
	}
}
