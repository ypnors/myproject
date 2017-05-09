package oo.shopping;

public class tester extends shop {
	
	public static void main(String[] args){
		System.out.println("客戶等級"+"\t"+"消費"+"\t"+"折扣後"+"\t"+"回饋金");
		shop s1=new shop();
		shop s2=new shop();
		shop s3=new shop();
		s1.normal(6000);
		s2.silver(8000);
		s2.silver(10000);
		s3.gold(30000);
		s1.normal(2000);
		s3.gold(10000);
		
	}

}
