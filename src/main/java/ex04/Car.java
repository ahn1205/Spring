package ex04;

public class Car {
	private IBattery battery;
//	생성자 주입
	public Car(IBattery battery) {
		this.battery = battery;
	}
	public IBattery getBattery() {
		return battery;
	}
	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
}
