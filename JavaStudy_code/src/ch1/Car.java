package ch1;

public class Car {
	
	Door d1=new Door();
	Door d2=new Door();
	
	Wheel w1=new Wheel();
	Wheel w2=new Wheel();
	Wheel w3=new Wheel();
	Wheel w4=new Wheel();
	
	public static void main(String[] args) {
		Car c=new Car();
		c.car_info();
		
	}
	public void car_info(){
		System.out.println("자동차를 만들었습니다!");
	}
}
