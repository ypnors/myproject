package oo.test;

public class MemberTester {

	public static void ain(String[] args){
		Member member=new Member("Eric");
		member.setAge(-5);
		System.out.println(member.getAge());
		
		//Phone Member
		PhoneMember member2=new PhoneMember();
		PhoneMember member3=new PhoneMember();
	}
}
