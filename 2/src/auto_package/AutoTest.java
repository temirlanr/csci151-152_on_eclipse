package auto_package;

public class AutoTest {
	public static void main(String[] args) {
		
		Automobile car1 = new Automobile();
		Automobile car2 = new Automobile();
		
		car1.setCarModel("toyota");
		car2.setCarModel("mercedes");
		
		car1.startCar();
			
		try{
			car1.pressGasPedal();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try{
			car2.pressGasPedal();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(car1);
		System.out.println(car2);
		
	/*	car1.pressBrake();
		car2.pressGasPedal();
		car2.shutdown();
		
		System.out.println(car1);
		System.out.println(car2);
		*/
	}
}
