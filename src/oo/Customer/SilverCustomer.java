package oo.Customer;

public class SilverCustomer extends Customer {

public SilverCustomer(int price){
	price=this.price;
}

public void print(){
	int s=(int) (price*0.9);
	System.out.println("�ȯ�"+"\t"+price+"\t"+s+"\t"+0);
}


}
