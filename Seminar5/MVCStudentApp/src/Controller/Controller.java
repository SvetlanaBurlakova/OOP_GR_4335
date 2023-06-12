package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private Collection<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }


    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }
    /**
     * Доступные операции над студентами
     */
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    model.DeleteStudent();
                    view.printAllStudents(students);
                    break;

            } 

        }
    }

}