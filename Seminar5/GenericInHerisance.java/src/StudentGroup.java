import java.util.Iterator;
import java.util.List;
import java.util.function.IntConsumer;

public class StudentGroup<T extends Comparable <T>,V > implements Iterable<Student<T,V>> {
    List<Student<T,V>> group;
    private V idGroup;
    /**
     * 
     * @param group Список студентов
     * @param idGroup Уникальный номер группы
     */
    public StudentGroup(List<Student<T,V>> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
    /**
     * Метод возвращает список студенов
     * @return
     */
    public List<Student<T,V>> getGroup() {
        return group;
    }
    /**
     * Оперделяет передаваемый метод студентов в текущий
     * @param group список студентов
     */
    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }
    /**
     * Метод возвращает уникальный номер группы
     */
    public V getIdGroup() {
        return idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "idGroup=" + idGroup +
                ", size=" + group.size() + "\n" + 
                "StudentList=" + group + 
                '}' + "\n" +
                "====================================";
    }
    /**
     * Переопределение итератора
     */
    @Override
    public Iterator<Student<T,V>> iterator() {

        return new Iterator<Student<T,V>>()
        {
            private int counter;
       
            @Override
            public boolean hasNext() {
                return counter<group.size();
            }
        
            @Override
            public Student<T,V> next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }

}