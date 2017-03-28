package oo.abstraction;

public class Car{
    String brand;
    int cc;
    String name;
    String type;
    int status;
    float milage;
    
    public Car(String brand,int cc,String name,String type){
        this.brand=brand;
        this.cc=cc;
        this.name=name;
        this.type=type;
    }

	public Car(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	
	public void setMilage(int m){
		milage=m;
	}
	
	public float addMilage(int m){
		milage =milage+m;
		return milage;
	}
	
	public void maintain(){
		status=5;
	}
}