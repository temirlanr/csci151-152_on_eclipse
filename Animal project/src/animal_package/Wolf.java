package animal_package;

public class Wolf extends AnimalImpl{

    public Wolf(int maxAge){
        super();
        setMaxAge(maxAge);
    }
    @Override
    public String animalKind() {
        return "Wolf";
    }

    @Override
	public void voice() {
		System.out.println("Aaah-Ooooooooooooooh! ");
		
	}
    
    @Override
    public boolean canEat(String food) {
        if(food.equals("Meat")){
            return true;
        }
        return false;
    }

    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)){
            throw new Exception("Wolfs cannot eat the " + food);
        }
        System.out.println("MUNCH, SLURP!!!");
    }



    public String toString(){
        return "A Wolf is " + this.age + " years old\n" +
               
            
                "Is this Wolf is alive? " + this.isAlive + "\n";
    }
}

