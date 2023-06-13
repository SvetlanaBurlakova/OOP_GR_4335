package SingleResponsibilityPrincipe;

public class Salary {
    private int baseSalary;
    private int taxNumber;

/** Конструктор для установки зарплаты и налога
 * @param baseSalary
 * @param taxNumber
 */
    public Salary(int baseSalary, int taxNumber) {
        this.baseSalary = baseSalary;
        this.taxNumber = taxNumber;
    }
    /**
     * Метод для расчета зарплаты после вычета налогов
     * @return возвращет зарплату после вычета налогов
     */
    public int calculateNetSalary() {
        return baseSalary - baseSalary * taxNumber;
    }
    /**
     * Метод возвращает зарплату
     * @return 
     */
    public int getBaseSalary() {
        return baseSalary;
    }
    /**
     * Метод устанавливает зарплату
     * @param baseSalary
     */
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    /**
     * Метод возвращает налоговую ставку
     * @return
     */
    public int getTaxNumber() {
        return taxNumber;
    }
    /**
     * Метод устанавливает налоговую ставку
     * @param taxNumber
     */
    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }
    
}
