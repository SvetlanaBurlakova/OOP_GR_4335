package Controllers;

import StudentDomen.Person;

public interface iUserController <T extends Person> {
    void create(String firstName, String secondName, int age);
}
