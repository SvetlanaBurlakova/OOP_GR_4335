package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    List<StudentGroup> steam;
    private int idSteam;
    /**
     * Оперделение потока
     * @param steam Список групп студентов
     * @param idSteam Уникальный номер группы
     */
    public StudentSteam(List<StudentGroup> steam, int idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }
    /**
     * Метод возвращает поток
     * @return
     */
    public List<StudentGroup> getSteam() {
        return steam;
    }
    /**
     * Метод оперделяет в кещий поток - передаваемый поток
     * @param steam
     */
    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }
    /**
     * Получение уникального номера потока
     * @return
     */
    public int getIdSteam() {
        return idSteam;
    }
    /**
     * Переопределение итератора
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>()
        {
            private int counter;
       
            @Override
            public boolean hasNext() {
                return counter<steam.size();
            }
        
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return steam.get(counter++);
            }
        };
    }
    @Override
    public String toString() {
        return "StudentSteam" +
        "{idSteam= " + idSteam + 
        " groupCount= " + steam.size() + "\n" +
        " steam= " + steam + "}";
    }
}
