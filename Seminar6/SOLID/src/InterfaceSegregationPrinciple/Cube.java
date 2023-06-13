package InterfaceSegregationPrinciple;

public class Cube implements Shape3D{
    private int edge;
    /**
     * Конструктор куба
     * @param длина ребра
     */
    public Cube(int edge) {
        this.edge = edge;
    }
    /**
     * Расчет площади
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    /**
     * Расчет объема
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}   
