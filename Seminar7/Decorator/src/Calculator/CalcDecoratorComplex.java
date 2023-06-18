package Calculator;

public class CalcDecoratorComplex implements iCalculableComplex{
    private iCalculableComplex oldCalc;
    private Logger logger;
    /**
     * Конструктор декоратора калькулятора комплексных чисел
     * @param калькулятор
     * @param логирование
     */
    public CalcDecoratorComplex(iCalculableComplex oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }
    /**
     * Переопределение метода расчета суммы комплексных чисел
     */
    @Override
    public void sum(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("Первое число %d + %di. Начало вызова метода sum с числом %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.sum(arg_real, arg_imaginary);
        logger.log(String.format("Расчет метода sum произошел"));
    }
    /**
     * Переопределение метода расчета произведения комплексных чисел
     */
    @Override
    public void multi(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("Первое комплексное число %d + %di. Начало вызова метода расчета умножения multi с комплексным числом %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.multi(arg_real, arg_imaginary);
        logger.log(String.format("Вызова метода multi произошел"));
    }
    /**
     * Переопределение метода расчета деления комплексных чисел
     */
    @Override
    public void div(int arg_real, int arg_imaginary) {
        int firstRealArg = oldCalc.get_real();
        int firstImaginaryArg = oldCalc.get_imaginary();
        logger.log(String.format("Первое комплексное число %d + %di. Начало вызова метода расчета деления div с комплексным числом %d + %di", firstRealArg, firstImaginaryArg, arg_real, arg_imaginary));
        oldCalc.div(arg_real, arg_imaginary);
        logger.log(String.format("Вызова метода div произошел"));
    }
    /**
     * Метод получения вещественной части комплексного числа
     */
    @Override
    public int get_real() {
        int result = oldCalc.get_real();
        logger.log(String.format("Вещественная часть %d", result));
        return result;
    }
    /**
     * Метод получения мнимой части комплексного числа
     */
    @Override
    public int get_imaginary() {
        int result = oldCalc.get_imaginary();
        logger.log(String.format("Мнимая чать %d", result));
        return result;
    }

}
