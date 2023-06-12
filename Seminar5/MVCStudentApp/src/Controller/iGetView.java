package Controller;

import java.util.Collection;

import Model.Student;

public interface iGetView {
    void printAllStudents(Collection<Student> students);
    String prompt(String message);
}
