package oo.stati;

import java.util.ArrayList;

public class Tester {
	
	public static void main(String[] args){
		System.out.println(Student.pass);
		Student stu1=new Student(58,98,66);
		Student stu2=new Student(89,56,77);
		stu1.pass=70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu1=new GraduateStudent(66,78,86);
		GraduateStudent gstu2=new GraduateStudent(78,89,86);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(58,98,66));
		list.add(new Student(67,56,77));
		list.add(new Student(88,99,60));
		list.add(new GraduateStudent(66,87,66));
		list.add(new GraduateStudent(78,89,60));
		for(int i=0;i<list.size();i++){
			Student stu=list.get(i);
			stu.print();
		}
	}

}
