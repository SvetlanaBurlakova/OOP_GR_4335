package OpenClosedPrinciple;

public class Bus extends Vehicle{
    public Bus(int maxSpeed,double multiplierForMaxSpeed) {
        super(maxSpeed, multiplierForMaxSpeed);
    }
    @Override
    public double calculateAllowedSpeed(){
        return this.getMaxSpeed() * this.getMultiplierForMaxSpeed();
    }
}
