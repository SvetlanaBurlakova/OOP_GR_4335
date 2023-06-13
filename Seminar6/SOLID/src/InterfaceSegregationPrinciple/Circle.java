package InterfaceSegregationPrinciple;

public class Circle implements Shape2D{
    private double radius;
    /**
     * Конструктор круга
     * @param радиус
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /**
     * Расчет площади
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
