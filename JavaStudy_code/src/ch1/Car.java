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
		c.start_car();
		
		c.d1.door_info();
		c.w1.wheel_info();
		
		c.d1.color="blue";
		c.w1.size=20;
		
		c.d1.door_info();
		c.w1.wheel_info();
		
		
		c.stop_car();
	}
	public void car_info(){
		System.out.println("자동차를 만들었습니다!\n");
	}
	
	public void start_car(){
		System.out.println("자동차의 시동을 걸었습니다!\n");
	}
	public void stop_car(){
		System.out.println("\n자동차의 시동을 껐습니다!");
	}
	
}
