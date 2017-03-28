package oo.abstraction;

public class CarTester{
    public static void main(String[] args){
        Car c1=new Car("TOYOTA","ALTIS",1800);
        Car c2=new Car("HONDA","ACCORD",2000);
        Car c3=new Car("HONDA","ACCORD",2000);
        int[] n=new int[5];
        n[0]=0;
        n[1]=0;
        n[2]=0;
        n[3]=0;
        System.out.println(n[2]);
        
        Car[] cars = new Car[3];
        System.out.println(cars[0]);
     cars [0] =new Car("TOYOTA","ALTIS",1800);
     cars [1] =new Car("HONDA","ACCORD",2000);
     cars [2] =new Car("TOYOTA","WISH",2000);
     System.out.println(cars[0].name);
     for(int i=0;i<=9;i++){
    	 System.out.println(i);
     }
     
     class AA{
    	 
     }
     AA a=new AA();
    }
  
    
    
}