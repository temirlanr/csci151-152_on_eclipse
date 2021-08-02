package AnimalProj;

public interface Animal {
	
	/** 
	* 
	* @return the name of the animal. 
	*/ 
	public String animalKind(); 
	
	/** 
	* 
	* @return the age of the animal. 
	*/ 
	public int getAge(); 
	
	/** 
	* 
	* @param food gives us the name of food. 
	* @return false or true depending on if the animal can eat the given food
	*/ 
	public boolean canEat(String food); 
	
	/** 
	* Implement the age of the animal. 
	*/ 
	public void ageOneYear(); 
	
	/** 
	* 
	* @param food 
	* @throws Exception if the animal cannot eat the given food. 
	* The food type depends on the kind of the animal. 
	*/ 
	public void feed(String food) throws Exception; 
	
	/** 
	 * Each animal has its own maximum age. 
	 * And if the age of the animal is larger than its max age 
	 * the function says that the animal is not alive. 
	 */ 
	public void isAlive(); 

	/** 
	* The function tells us if the animal is full or not. 
	*/ 
	public boolean isFull(int number); 

}
