package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher>{
    private int counter;
    private final List<Teacher> teachers;

    public TeacherIterator(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean hasNext() {
        return counter<teachers.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext())
        {
            return null;
        }
        return teachers.get(counter++);
    }
}
