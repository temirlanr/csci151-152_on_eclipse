package clock;

public class ClockTest {
	
	public static void main(String[] args) {
		

		Clock test=new Clock(6,5,49);
		
		test.leadHours();
		test.leadMinutes();
		test.leadSeconds();
		
		test.tick();
		System.out.println(test);
		
		test.resetToMidnight();
		System.out.println(test);
		
		try{
			test.setHours(5);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		test.getHours();
		test.getMinutes();
		test.getSeconds();
		
		System.out.println(test);
	}
}
