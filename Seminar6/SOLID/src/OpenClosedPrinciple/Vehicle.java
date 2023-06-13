package OpenClosedPrinciple;

public class Vehicle {
    int maxSpeed;
    double multiplierForMaxSpeed;
    /**
     * Конструктор - определение транспортного средства
     * @param максимальная скорость
     * @param множитель для расчета разрешенной скорости
    */
    public Vehicle(int maxSpeed, double multiplierForMaxSpeed) {
        this.maxSpeed = maxSpeed;
        this.multiplierForMaxSpeed = multiplierForMaxSpeed;
    }
    /**
     * Метод возвращает максимальнуб скорость т/c
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
        /**
     * Метод возвращает множитель для расчета допустимой скорости т/c
     * @return
     */
    public double getMultiplierForMaxSpeed() {
        return this.multiplierForMaxSpeed;
    }
    /**
     * Расчет максимально разрешенной скорости
     * @return
     */
    public double calculateAllowedSpeed(){
        return this.maxSpeed*this.multiplierForMaxSpeed;
    }
}

