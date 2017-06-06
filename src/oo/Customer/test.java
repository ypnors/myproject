package oo.Customer;

import java.util.ArrayList;

import oo.shopping.Customer;
import oo.shopping.GoldenCustomer;
import oo.shopping.SilverCustomer;

public class test {
	public static void main(String[] args){
		ArrayList<Customer> list=new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new GoldenCustomer(10000));
		list.add(new GoldenCustomer(15000));
		list.add(new SilverCustomer(100));
		list.add(new Customer(6000));
		for(int i=0;i<list.size();i++){
			Customer cust=list.get(i);
			if(cust instanceof SilverCustomer&& !(cust instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer silver = (SilverCustomer)cust;
			}	
		}
		}
	}
