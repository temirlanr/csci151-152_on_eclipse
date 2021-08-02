package animal_package;

public class Tiger extends AnimalImpl{

    public Tiger(int maxAge){
        super();
        setMaxAge(maxAge);
    }
    @Override
    public String animalKind() {
        return "Tiger";
    }

    @Override
	public void voice() {
		System.out.println("ROAR!!!!");
		
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
            throw new Exception("Tigers cannot eat the " + food);
        }
        System.out.println("MUNCH, MUNCH!!!");
    }



    public String toString(){
        return "A Tiger is " + this.age + " years old\n" +
               
            
                "Is this Tiger is alive? " + this.isAlive + "\n";
    }
}
