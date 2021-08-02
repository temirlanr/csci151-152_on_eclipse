package omg_package;

public class IPad extends Apple{
//fields
private boolean stilus; 
	public IPad(int p, int g, String c, String s) throws Exception {
		
		
		super(p, g, c, s);
		setStilus(false);
		// TODO Auto-generated constructor stub
	}
	public boolean isStilus() {
		return stilus;
	}
	public void setStilus(boolean stilus) {
		this.stilus = stilus;
	}
	//Overridden method
	public void customize(String newColor,boolean stilus) {
		setColor(newColor);
		setGuarantee(false);
		setStilus(stilus);
	}
//new Method
	public void drawSomething() {
		System.out.println("        $$$        $$$$$      $$$$         $$$$     $$$$$\r\n" + 
				"        $$$       $$$$$$$     $$$$         $$$$    $$$$$$$\r\n" + 
				"        $$$       $$$$$$$     $$$$$       $$$$$    $$$$$$$\r\n" + 
				"        $$$       $$$$$$$      $$$$       $$$$     $$$$$$$\r\n" + 
				"        $$$      $$$$ $$$$     $$$$$     $$$$$    $$$$ $$$$\r\n" + 
				"        $$$      $$$$ $$$$      $$$$     $$$$     $$$$ $$$$\r\n" + 
				"        $$$     $$$$$ $$$$$     $$$$     $$$$    $$$$$ $$$$$\r\n" + 
				"        $$$     $$$$   $$$$     $$$$$   $$$$$    $$$$   $$$$\r\n" + 
				"        $$$     $$$$   $$$$      $$$$   $$$$     $$$$   $$$$\r\n" + 
				"        $$$    $$$$$   $$$$$     $$$$$ $$$$$    $$$$$   $$$$$\r\n" + 
				"        $$$    $$$$$$$$$$$$$      $$$$ $$$$     $$$$$$$$$$$$$\r\n" + 
				"$$$$   $$$$    $$$$$$$$$$$$$      $$$$ $$$$     $$$$$$$$$$$$$\r\n" + 
				"$$$$   $$$$   $$$$$$$$$$$$$$$      $$$$$$$     $$$$$$$$$$$$$$$\r\n" + 
				"$$$$$ $$$$$   $$$$       $$$$      $$$$$$$     $$$$       $$$$\r\n" + 
				"$$$$$$$$$$$  $$$$$       $$$$$     $$$$$$$    $$$$$       $$$$$\r\n" + 
				" $$$$$$$$$   $$$$         $$$$      $$$$$     $$$$         $$$$\r\n" + 
				"  $$$$$$$    $$$$         $$$$      $$$$$     $$$$         $$$$");
	}
	public String toString(){
        String strPrice = "Price of the iPad: "+ getPrice(), strGeneration = " Generation of the iPad: "+getGeneration(), strColor = " Color of the iPad: "+getColor(), 
        		strSize = " Size of the iPad: "+ getSize()+ " Is it have stilus: "+ isStilus();
        
        return strPrice + strGeneration + strColor + strSize;
    }
}
