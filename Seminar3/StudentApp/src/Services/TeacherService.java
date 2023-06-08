package Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iUserService{
    //private String acadDegree;
    //private int count;
    private List<Teacher> teachers;
    /**
     * Конструктор класса, создает новый список, в котором будут храниться 
     * информация об учителях
     */
    public TeacherService(){
        this.teachers = new ArrayList<Teacher>();
    }
    public TeacherService(List<Teacher> teach){
        this.teachers = teach;
    }
    /**
     * Метод возвращает список учителей
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    /**
     * Добавление учителя в список учителей
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, "Degree");
        teachers.add(per);
    }
    /**
     * Сортировка листа учителей
     * @return
     */
    public List<Teacher> getSortedByFIOsTeachersList(){
        List<Teacher> newTeachList = new ArrayList<Teacher> (teachers);
        newTeachList.sort(new PersonComparator<Teacher>());
        return newTeachList;
    }

}
