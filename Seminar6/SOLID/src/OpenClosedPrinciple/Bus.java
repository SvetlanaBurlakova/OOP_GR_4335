package OpenClosedPrinciple;

public class Bus extends Vehicle{
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public double calculateAllowedSpeed(){
        return this.getMaxSpeed() * 0.8;
    }
}
