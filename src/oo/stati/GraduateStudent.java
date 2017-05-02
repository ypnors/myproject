package oo.stati;

public class GraduateStudent extends Student{
public GraduateStudent(int english, int math, int chinese) {
		super(english, math, chinese);
		// TODO Auto-generated constructor stub
	}
int thesis;
public static void main(String[] args){
	System.out.println(Student.pass);
	Student stu=new Student(thesis, thesis, thesis);
	Student stu1=new Student(58,98,66);
	Student stu2=new Student(67,56,77);
	stu1.pass=70;
	
}

}
