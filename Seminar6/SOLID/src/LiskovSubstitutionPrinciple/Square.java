package LiskovSubstitutionPrinciple;

public class Square implements Shape{
    private int length;
    /**
     * Конструктор для квадрата
     * @param длина стороны квадрата
     */
    public Square(int length) {
        this.length = length;
    }
    /**
     * Установка длины квадрата
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }
    /**
     * расчет площади квадрата
     */
    public int area() {
        return this.length * this.length;
    }
}

