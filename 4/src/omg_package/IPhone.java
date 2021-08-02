package omg_package;

public class IPhone extends Apple{
private int memory;
	public IPhone(int p, int g, String c, String s) throws Exception {
		super(p, g, c, s);
		setMemory(64);
		
		// TODO Auto-generated constructor stub
	}
	//Overridden method
	public void customize(String color,int m) throws Exception {
		if (m<64||m>256) {throw new Exception("You had entered invalid memory");}
		setMemory(m);
		setColor(color);
		setGuarantee(false);
	}
	//new Method
	public void helloSiri() {
		System.out.println("Hello! I am Siri! Glad to see you!");
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String toString(){
        String strPrice = "Price of the iPhone: "+ getPrice(), strGeneration = " Generation of the iPhone: "+getGeneration(), strColor = " Color of the iPhone: "+getColor(), 
        		strSize = " Size of the iPhone: "+ getSize(), strMemory= " Memory of the iPhone: "+ getMemory();
        
        return strPrice + strGeneration + strColor + strSize + strMemory;
    }

}
