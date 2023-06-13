package OpenClosedPrinciple;

public class Car extends Vehicle{

    public Car(int maxSpeed,double multiplierForMaxSpeed) {
        super(maxSpeed, multiplierForMaxSpeed);
    }

    @Override
    public double calculateAllowedSpeed(){
        return this.getMaxSpeed() * this.getMultiplierForMaxSpeed();
    }
    
}
