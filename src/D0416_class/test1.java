package D0416_class;

class Student {
	//member variables
	protected String name;
	protected int age;
	
	//constructors
	public Student() {
		this.name = "이슬기";
		this.age = 26;
	}
	//constructor overloading
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//member methods
	public void studying() {
		System.out.println("Student studying");
	}
	//method overloading
	public void studying(String msg) {
		System.out.println("Student studying" + msg);
	}
}
class MiddleStudent extends Student{
	int grade;
	public MiddleStudent() {
			this.name = "이순신";
			this.age = 40;
			this.grade = 50;
	}
	public MiddleStudent(String name, int age, int grade) {
			super(name, age);
			this.name = name;
			this.age = age;
			this.grade = grade;
			
	}
	public void playngGame() {
			System.out.println("MiddleStudent playingGame");
	}
			
	public void studying() {
				System.out.println("MiidleStudent studying");
	}
			//method overloading
	public void studying(String msg) {
				System.out.println("MiddleStudent studying" + msg);
	}	
}

public class test1 {
	public static void main(String[] args) {
		//Student stu = new Student();
		//MiddleStudent midStu = new MiddleStudent();
//		MiddleStudent midStu2 = new MiddleStudent("강감찬", 30, 50);
//		midStu2.studying();
//		midStu2.playngGame();
//		
		Student midStu3 = new MiddleStudent("권율", 50, 60);
		midStu3.studying();
		midStu3.studying(" test");
		MiddleStudent stu3 = (MiddleStudent)midStu3;
		stu3.studying();
		stu3.studying(" test1");
		stu3.playngGame();
	}
}
