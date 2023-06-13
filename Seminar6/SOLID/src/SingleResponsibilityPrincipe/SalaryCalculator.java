package SingleResponsibilityPrincipe;

public class SalaryCalculator {
    private int taxNumber;

/** Конструктор для установки налоговой ставки
 * @param taxNumber
 */
    public SalaryCalculator(int taxNumber) {
        this.taxNumber = taxNumber;
    }
    /**
     * Метод для расчета зарплаты после вычета налогов
     * @return возвращет зарплату после вычета налогов
     */
    public int calculateNetSalary(Employee employee) {
        return employee.getBaseSalary()*(1 - taxNumber);
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
