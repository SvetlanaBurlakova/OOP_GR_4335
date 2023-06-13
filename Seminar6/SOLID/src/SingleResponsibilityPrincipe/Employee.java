package SingleResponsibilityPrincipe;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;
    /**
     * Конструктор - определяет сотрудника
     * @param Имя
     * @param Дата
     */
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    /**
     * Метод возвращает информацию о сотруднике
     * @return
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    
}