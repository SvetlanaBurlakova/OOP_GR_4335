package Controller;

import java.util.Collection;

import Model.Student;

public interface iGetModel {
    public Collection<Student> getAllStudents();
    public void DeleteStudent();
}
