package Controllers;

import StudentDomen.Person;

public interface iPersonControler<T extends Person> {
    void create(String firstName, String secondName, int age);
}
