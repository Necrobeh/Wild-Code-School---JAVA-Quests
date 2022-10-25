public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if(this.getAltitude() == 0 && this.isFlying() == false){
            this.flying = true;
            System.out.println(this.getName() + "has taken off !");
        }else{
            System.out.println(this.getName() + "is already flying");
        }
    }

    @Override
    public int ascend(int meters){
        if(this.isFlying() == true){
            this.altitude = Math.min(this.getAltitude() + meters, 6096);
            System.out.println(this.getName() + " is now flying at " + this.getAltitude() + " meters");
        }else{
            System.out.println(this.getName() + " is not flying yet !");
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters){
        if(this.isFlying() == true){
            this.altitude = Math.max(this.getAltitude() - meters, 0);
            System.out.println(this.getName() + " is now flying at " + this.getAltitude() + " meters");
        }else{
            System.out.println(this.getName() + " is not flying yet !");
        }
        return this.altitude;
    }

    @Override
    public void land(){
        if(this.isFlying() == true && this.getAltitude() == 0){
            this.flying = false;
            System.out.println(this.getName() + " has landed !");
        }else if(this.isFlying() == false){
            System.out.println(this.getName() + " is not flying yet !");
        }else{
            System.out.println(this.getName() + " is still flying !");
        }
    }

    @Override
    public void glide(){
        if(this.isFlying() == true){
            System.out.println(this.getName() + " is gliding nicely !");
        }
    }


}
