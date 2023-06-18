package Calculator;

import java.util.Scanner;

public class ViewCalculatorComplexNumber {
        private iCalculableComplex calculator;
    /**
     * Конструктор вью калькулятора комплексных чисел
     */
    public ViewCalculatorComplexNumber(iCalculableComplex calculator) {
        this.calculator = calculator;
    }
    /**
     * Метод запуска калькулятора для расчетов
     */
   public void run() {
        while (true) {
            int primaryRealArg = promptInt("Введите вещественную часть числа: ");
            int primaryImaginaryArg = promptInt("Введите мнимую часть числа: ");
            calculator.sum(primaryRealArg, primaryImaginaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int argReal = promptInt("Введите вещественную часть числа: ");
                    int argImaginary = promptInt("Введите мнимую часть числа: ");
                    calculator.multi(argReal, argImaginary);
                    //calculator.multi_imaginary(argReal, argImaginary);
                    continue;
                }
                if (cmd.equals("+")) {
                    int argReal = promptInt("Введите вещественную часть числа: ");
                    int argImaginary = promptInt("Введите мнимую часть числа: ");
                    calculator.sum(argReal, argImaginary);
                    continue;
                }
                if (cmd.equals("/")) {
                    int argReal = promptInt("Введите вещественную часть числа: ");
                    int argImaginary = promptInt("Введите мнимую часть числа: ");
                    calculator.div(argReal, argImaginary);
                    continue;
                }
                if (cmd.equals("=")) {
                    int resultReal = calculator.get_real();
                    int resultImaginary = calculator.get_imaginary();
                    System.out.printf("Результат %d + %di\n", resultReal, resultImaginary);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    /**
     * Метод считывания числа с консоли
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
