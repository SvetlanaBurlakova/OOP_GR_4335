package StudentDomen;

import java.util.List;

public class  AverageAge <T extends Person> {
    int aver;
    int sum;
    int count = 0;
    List <T> persons;
    /**
     * Конструктор класса расчета среднего возраста
     * @param persons Список, содержащий 
     * Persons или его наследников
     */
    public AverageAge(List <T> persons){
        this.persons = persons;
    }
    /**
     * Метод расчета среднего возраста
     * @return средний возраст
     */
    public double getAverageAge(){
        for (T per : persons) {
            sum+=per.getAge();
            count++;
        }
        return sum/count;
    }

}