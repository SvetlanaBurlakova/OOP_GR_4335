package View;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    /**
     * Печать информациии о всех студентах из списка students
     */
        public void printAllStudents(Collection<Student> students)
    {
        System.out.println("-----Print of Student list-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----End of list-----");
    }
    /**
     * Метод выводит сообщение, запрос на ввод информации
     */
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
