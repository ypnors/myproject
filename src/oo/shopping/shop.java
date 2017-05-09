package oo.shopping;

public class shop {

	public int normal(int n){
		System.out.println("¤@¯ë"+"\t"+n+"\t"+n+"\t"+0);
		return n;
	}
	
	public int silver(int p){
		int s=(int) (p*0.9);
		System.out.println("»È¯Å"+"\t"+p+"\t"+s+"\t"+0);
		return s;
	}
	
	public void gold(int p){
		int s=(int) (p*0.9);
		int mon=(int) (p*0.05);
		System.out.println("ª÷¯Å"+"\t"+p+"\t"+s+"\t"+mon);
	}
}
