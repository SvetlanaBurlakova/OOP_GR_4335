package OpenClosedPrinciple;

public class Vehicle {
    int maxSpeed;
    String type;
    /**
     * Конструктор - определение транспортного средства
     * @param максимальная скорость
     * @param тип
    */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /**
     * Метод возвращает максимальнуб скорость т/c
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**
     * Метод возвращает тип т/c
     * @return
     */
    public String getType() {
        return this.type;
    }
}

