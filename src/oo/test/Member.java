package oo.test;

public class Member {
String id;
private int age;
String name;
public Member(){
	System.out.println("Member constructor");
}

void setAge(int age){
	if(age<0){
		age=0;
	}
	this.age=age;
}
public int getAge(){
	return age;
}
}

