package animal_package;

public class TestAnimal {
    public static void main(String[] args){
        Animal cow = new Cow(1000000);
        Animal tiger = new Tiger(25);
        Animal wolf = new Wolf(25);

        System.out.println("Can cows eat grass? -"+cow.canEat("Grass"));
        cow.voice();
        try{cow.feed("Grass");}
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\n\nCan tigers eat meat? -"+tiger.canEat("Meat"));  
        tiger.voice(); 
        try{tiger.feed("FLOWERS\n\n\n");}
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Can wolfs eat meat? -"+tiger.canEat("Meat"));  
        wolf.voice(); 
        try{wolf.feed("SPAGHETTI\n\n\n");}
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        cow.setMaxAge(2);
        cow.ageOneYear();cow.ageOneYear();cow.ageOneYear();
        tiger.ageOneYear();
        System.out.println(cow);
        System.out.println(tiger);
        System.out.println(wolf);
      

    }
}
