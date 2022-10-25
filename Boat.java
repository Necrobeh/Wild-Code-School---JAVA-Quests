public class Boat extends Vehicle {

    public Boat(String brand, int kilometers){
        super(brand, 0);
    }

    @Override
    public void doStuff(){
        System.out.println("I am " + this.getBrand() + " and I go bloop bloop bloop !");
    }
    
}
