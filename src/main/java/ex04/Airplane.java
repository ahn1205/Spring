package ex04;

public class Airplane {
	private IBattery battery;

		
	public Airplane(IBattery battery) {
		super();
		this.battery = battery;
	}

	public IBattery getBattery() {
		return battery;
	}

	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
	
}
