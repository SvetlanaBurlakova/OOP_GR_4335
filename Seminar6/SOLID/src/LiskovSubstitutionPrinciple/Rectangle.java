package LiskovSubstitutionPrinciple;

public class Rectangle implements Shape{
    private int width;
    private int height;
    /**
     * Конструктор для определения пямоугольника
     * @param ширина
     * @param высота
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    /**
     * Указание ширины прямоугольника
     * @param ширина
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * Указание высоты прямоугольника
     * @param высота
     */
    public void setHeight(int height) {
        this.height = height;
    }
    /**
     * Расчет площади прямоугольника
     */
    public int area() {
        return this.width * this.height;
    }
}
