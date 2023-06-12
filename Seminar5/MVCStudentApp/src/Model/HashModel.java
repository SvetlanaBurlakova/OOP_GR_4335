package Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import Controller.iGetModel;

public class HashModel implements iGetModel{
    private HashMap<Long,Student> students;

    /**
     * Конструктор
     * @param students HashMap, который хранит информацию ID студента и соответ-его ему студента
     */
    public HashModel(HashMap<Long,Student> students){
        this.students = students;
    }

    public void DeleteStudent(){
        System.out.println("Введите ID студента, которого необходимо удалить");
        Scanner iScanner = new Scanner(System.in);
        Long id = iScanner.nextLong();
        if (students.containsKey(id)){
            students.remove(id);
            System.out.printf("Студент с ID %n удален", id);
        }
        else {
            System.out.printf("Студента с указанным ID %n не найден", id);
        }
    }
    /**
     * Метод возвращает информацию о студентах
     */
    public Collection<Student> getAllStudents(){
        return students.values();
    }
    
}
