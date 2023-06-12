import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.HashModel;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Иванов", 21, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 25, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        HashMap<Long,Student> studentsMap = new HashMap<Long,Student>();
        studentsMap.put((long) 101, s1);
        studentsMap.put((long) 111, s2);
        studentsMap.put((long) 121, s3);
        studentsMap.put((long) 301, s4);
        studentsMap.put((long) 174, s5);
        studentsMap.put((long) 104, s6);

        
       //FileModel fModel = new FileModel("studentDB.txt");
       //fModel.saveAllStudentToFile(students);
       iGetModel model = new HashModel(studentsMap);
       //iGetModel newFModel = fModel;
       iGetView view = new ViewEng();

       Controller controller = new Controller(view, model);
       controller.update();
       controller.run();
    }
}
