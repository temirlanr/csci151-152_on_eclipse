package pack5;

public class Tiger extends AnimalImpl{
	
	public Tiger(int a, int max, boolean alive){ 
		super(a,max,alive); 
	} 
	
	public String animalKind() { 
		return "Tiger"; 
	} 

	@Override 
	public boolean canEat(String food) { 
		return food.equals("Meat"); 
	} 

	@Override 
	public void feed(String food) throws Exception { 
		if(!canEat(food)){ 
			throw new Exception ("Tigers cannot eat "+food); 
		}else{ 
			System.out.println("MUNCH, MUNCH!!!"); 
		} 
	} 

	@Override 
	public boolean isFull(int number) { 
		return !(number==2||number ==1); 
	} 

	public String toString(){ 
		return "A tiger which is "+getAge()+" years old."; 
	} 
}
