package SingleResponsibilityPrincipe;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;
    /**
     * Конструктор - определяет сотрудника
     * @param Имя
     * @param Дата
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    /**
     * Метод возвращает зарплату сотрудника
     * @return
     */
    public int getBaseSalary(){
        return baseSalary;
    }
    /**
     * Метод возвращает информацию о сотруднике
     * @return
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    
}