package omg_package;

public class Apple {
//fields 
	private int price;
	private int generation;
	private boolean guarantee;
	private boolean integrity;
	private String size;
	private String color;
//Constructor
	public Apple(int p,int g,String c,String s) throws Exception{
		if ((p<400) || (g < 1 || g > 10 || g==9)) {
            throw new Exception("Incorrect setting of generation or price!");
        }
		price=p;
		setGeneration(g);
		setGuarantee(true);
		setColor(c);
		setSize(s);
		setIntegrity(true);
	}
//Methods
	public void jailBreakDevice() {
		setGuarantee(false);
		price= price-200;
	}
	public void dropDevice() {
		setIntegrity(false);
	}
	public void repairDevice() {
		setIntegrity(true);
		setGuarantee(false);
		price= price-300;
	}
	public void customize(String newColor) {
		setColor(newColor);
		setGuarantee(false);
	}
	public String toString(){
        String strPrice = "Price of the Apple device: "+price, strGeneration = " Generation of the Apple device: "+generation, strColor = " Color of the Apple device: "+color, 
        		strSize = " Size of the Apple device: "+size;
        
        return strPrice + strGeneration + strColor + strSize;
    }
	

//Getters
	/**
     * @return the Price
     */
	
	public int getPrice() {
		return price;
	}
	/**
     * @return the Generation
     */
	
	public int getGeneration() {
		return generation;
	}
	/**
     * @return the Guarantee
     */
	public boolean isGuarantee() {
		return guarantee;
	}
	/**
     * @return the Integrity
     */
	public boolean isIntegrity() {
		return integrity;
	}	
	/**
     * @return the Size
     */
	public String getSize() {
		return size;
	}
	/**
     * @return the Color
     */
	public String getColor() {
		return color;
	}
//Setters	
	  /**
     * @param gen to set
     * @throws Exception if input is invalid
     */
	public void setGeneration(int gen) throws Exception {
		if (gen < 1 || gen > 10 || gen==9) {
            throw new Exception("Incorrect setting of generation!");
        }
		this.generation = gen;
	}
	
	  /**
     * @param Guarantee to set
     */
	public void setGuarantee(boolean guarantee) {
		this.guarantee = guarantee;
	}
	
	  /**
     * @param Integrity to set
     */
	public void setIntegrity(boolean integrity) {
		this.integrity = integrity;
	}

	  /**
     * @param size to set
     */
	public void setSize(String size) {
		
		this.size = size;
	}
	
	  /**
     * @param Color to set
     */
	public void setColor(String color) {
		this.color = color;
	}
	
}
