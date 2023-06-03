package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup> {
    List<Student> group;
    private int idGroup;
    /**
     * 
     * @param group Список студентов
     * @param idGroup Уникальный номер группы
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
    /**
     * Метод возвращает список студенов
     * @return
     */
    public List<Student> getGroup() {
        return group;
    }
    /**
     * Оперделяет передаваемый метод студентов в текущий
     * @param group список студентов
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }
    /**
     * Метод возвращает уникальный номер группы
     */
    public int getIdGroup() {
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
    public Iterator<Student> iterator() {

        return new Iterator<Student>()
        {
            private int counter;
       
            @Override
            public boolean hasNext() {
                return counter<group.size();
            }
        
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }
    /**
     * Переопределение сравнения
     * @param o обект StudentGroup
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        System.out.println(this.getIdGroup()+" - "+o.getIdGroup());
    if(this.group.size()==o.group.size())
        {
        if(this.idGroup<o.idGroup)
        {
            return -1;
        }        
        return 1    ;
        }
    if(this.group.size()<o.group.size())
        {
            return -1;
        }
        return 1;
    }
}