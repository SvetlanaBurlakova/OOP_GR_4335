package StudentDomen;

import java.util.Iterator;
import java.util.List;

public  class PersonIterator <T extends Person> implements Iterator{
    private int counter;
    private final List<T> persons;

    public PersonIterator(List<T> persons) {
        this.persons = persons;
    }

    @Override
    public boolean hasNext() {
        return counter<persons.size();
    }

    @Override
    public Person next() {
        if(!hasNext())
        {
            return null;
        }
        return persons.get(counter++);
    }
}
