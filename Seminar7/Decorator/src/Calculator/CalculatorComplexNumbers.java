package Calculator;

public class CalculatorComplexNumbers implements iCalculableComplex{
    private int real;
    private int imaginary;

    /**
     * Конструктор комплекснго числа
     * @param вещественная часть
     * @param мнимая часть
     */
    public CalculatorComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    /**
     * Расчет суммыкомплексных чисел
     * @param вещественная часть
     * @param мнимая часть
     */
    @Override
    public void sum(int arg_real,int arg_imaginary) {
        this.real += arg_real;
        this.imaginary += arg_imaginary;
    }
    /**
     * Расчет произведения комплексных чисел
     * @param вещественного часть
     * @param мнимая часть
     * @return
     */
    @Override
    public void multi(int arg_real, int arg_imaginary) {
        int result_real;
        int result_imag;
        result_real = this.real * arg_real - this.imaginary * arg_imaginary;
        result_imag = this.real * arg_imaginary + this.imaginary * arg_real;
        this.real = result_real;
        this.imaginary = result_imag;
    }
    /**
     * Расчет результата деления комплексного числа
     * @param вещественного часть
     * @param мнимая часть
     * @return
     */
    @Override
    public void div(int arg_real, int arg_imaginary) {
        int result_real;
        int result_imag;
        result_real = (this.real * arg_real + this.imaginary * arg_imaginary)/(arg_real*arg_real + arg_imaginary*arg_imaginary);
        result_imag = (this.imaginary * arg_real - this.real * arg_imaginary)/(arg_real*arg_real + arg_imaginary*arg_imaginary);
        this.real = result_real;
        this.imaginary = result_imag;
    }
    /**
     * Метод возвращает вещестенную часть комплесного числа
     */
    @Override
    public int get_real() {
        return real;
    }
    /**
     * Метод возвращает мнимую часть комплесного числа
     * @return
     */
    @Override
    public int get_imaginary() {
        return imaginary;
    }

    
}
