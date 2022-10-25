public abstract class Vehicle {

    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers){
        this.setBrand(brand);
        this.setKilometers(kilometers);
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public int getKilometers(){
        return this.kilometers;
    }

    public void setBrand(String data){
        this.brand = data;
    }

    public void setKilometers(int data){
        this.kilometers = data;
    }

    public abstract void doStuff();
}
