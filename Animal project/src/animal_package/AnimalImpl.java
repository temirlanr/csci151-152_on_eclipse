package animal_package;

public class AnimalImpl implements Animal{
    public int age;
    public boolean isAlive;
    public int maxAge;
    public AnimalImpl(){
        this.age = 0;
        this.isAlive = true;
    }
    @Override
    public String animalKind() {
        return "Some Animal";
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public boolean canEat(String food) {
        return true;
    }

    @Override
    public void ageOneYear() {
        this.age++;
       if(this.age > this.maxAge){
            this.isAlive = false;
        }
    }

    @Override
    public void feed(String food) throws Exception {
        throw new Exception("Some Exception");
    }


   
    @Override
    public void setMaxAge(int maxAge){
        this.maxAge = maxAge;
    }
	@Override
	public void voice() {
		System.out.println("SOME VOICE");
		
	}
	@Override
	public boolean isAlive() {
		 if(this.age > this.maxAge){
	           this.isAlive = false;
	        }
		 return this.isAlive;
	
		
	}
}
