package OpenClosedPrinciple;

public class Car extends Vehicle{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public double calculateAllowedSpeed(){
        return this.getMaxSpeed() * 0.8;
    }
    
}
