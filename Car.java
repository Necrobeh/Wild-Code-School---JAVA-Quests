public class Car extends Vehicle {

    public Car(String brand, int kilometers){
        super(brand, 0);
    }

    @Override
    public void doStuff(){
        System.out.println("I am " + this.getBrand() + " and I go zoom zoom zoom!");
    }
    
}
