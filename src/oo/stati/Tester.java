package oo.stati;

public class Tester {
	
	public static void main(String[] args){
		System.out.println(Student.pass);
		Student stu1=new Student(58,98,66);
		Student stu2=new Student(89,56,77);
		stu1.pass=70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu=new GraduateStudent;
	}

}
