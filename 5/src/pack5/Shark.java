package pack5;

public class Shark extends AnimalImpl{
	
	public Shark(int a, int max, boolean alive){ 
		super(a,max,alive); 
	}
	
	public String animalKind() { 
		return "Shark"; 
	} 

	@Override 
	public boolean canEat(String food) { 
		return food.equals("Fish"); 
	} 
	
	@Override 
	public void feed(String food) throws Exception { 
		if(!canEat(food)){ 
			throw new Exception ("Shark cannot eat "+food); 
		}else{ 
			System.out.println("Nom,nom..."); 
		} 
	} 

	@Override 
	public boolean isFull(int number) { 
		return !(number==2||number ==1); 
	} 

	public String toString(){ 
		return "A shark which is "+getAge()+" years old."; 
	} 
}
