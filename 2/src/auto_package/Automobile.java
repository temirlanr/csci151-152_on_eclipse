package auto_package;

public class Automobile {
	
	private boolean engineRunning;
	
	private double speed;
	
	private String carModel;
	
	public void setCarModel(String license) {
		carModel=license;
	}
	
	public Automobile(){
		engineRunning=false;
		speed=0.0;
	}
	
	public void startCar() {
		engineRunning=true;
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	public void pressGasPedal() throws Exception {
		if(engineRunning) {
			speed=speed+10.0;
		}else throw new Exception("engine is not running");
	}
	
	public void pressBrake() {
		speed=0.0;
	}
	
	public void shutdown() {
		engineRunning=false;
	}
	
	public boolean isEngineRunnning() {
		return engineRunning;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public double calculateDistance(double time) {
		return time*speed;
	}
	
	public String toString() {
		return "Car model: "+carModel+" Engine Running: "+engineRunning+" Speed: "+speed;
	}
}
