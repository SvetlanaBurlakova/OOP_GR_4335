import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        Student s7 = new Student("Михаил", "Макаров", 35, 201);
        Student s8 = new Student("Макар", "Мухин", 45, 202);
        Student s9 = new Student("Елена", "Сидоров", 21, 203);


        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();

        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud2.add(pers1);
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        StudentGroup group4335 = new StudentGroup(listStud1, 4335);
        StudentGroup group4336 = new StudentGroup(listStud2, 4336);
        StudentGroup group4332 = new StudentGroup(listStud3, 4332);

        listSteam.add(group4335);
        listSteam.add(group4336);
        listSteam.add(group4332);

        StudentSteam steam1 = new StudentSteam(listSteam, 1);

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }
        System.out.println("===============================");
        for(Student stud:group4336)
        {
            System.out.println(stud.toString());
        }
        System.out.println("===============================");
        System.out.println("Сортировка групп по кол-ву студентов и по ID группы: ");
        Collections.sort(steam1.getSteam());
        for(StudentGroup grp:steam1)
        {
            System.out.println(grp.toString());
        }
        System.out.println("===============================");
        Collections.sort(group4335.getGroup());
        Collections.sort(group4336.getGroup());


        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }
        System.out.println("===============================");
        for(Student stud:group4336)
        {
            System.out.println(stud.toString());
        }
        System.out.println("===============================");
        System.out.println(steam1.toString());
    }
}
