package animal_package;

public class Cow extends AnimalImpl {
    public Cow(){
        super();
    }

    public Cow(int maxAge){
        super();
        this.maxAge = maxAge;
    }

    @Override
    public String animalKind() {
        return "Cow";
    }

    @Override
    public void feed(String food) throws Exception {
        if(!this.canEat(food)){
            throw new Exception("Cows cannot eat the " + food);
        }
        System.out.println("Chew, chew, chew");
    }

    @Override
    public void ageOneYear() {
        this.age++;
        if(this.age > this.maxAge){
            this.isAlive = false;
        }
    }
    
    @Override
	public void voice() {
		System.out.println("Moooooooooo-o!");
		
	}

    @Override
    public boolean canEat(String food) {
        if(food.equals("Grass")){
            return true;
        }
        return false;
    }
    

    public String toString(){
        return "A cow is " + this.age + " years old\n" + 
    
                "Is this cow alive? " + this.isAlive + '\n';
    }
}
