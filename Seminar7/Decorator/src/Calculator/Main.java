package Calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {

        iCalculableComplex calculator = new CalculatorComplexNumbers(0, 0);
        //iCalculableComplex calculator = new CalcDecoratorComplex(new CalculatorComplexNumbers(0, 0), new Logger());

        ViewCalculatorComplexNumber view = new ViewCalculatorComplexNumber(calculator);
        view.run();
    }

}
