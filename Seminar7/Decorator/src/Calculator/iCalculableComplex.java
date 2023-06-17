package Calculator;

public interface iCalculableComplex {
    void sum(int arg_real,int arg_imaginary);
    void multi(int arg_real, int arg_imaginary);
    void div(int arg_real, int arg_imaginary);
    int get_real();
    int get_imaginary();
}
