import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Jim", "Carrey", 59, 188);
    }

    @Test
    public void personHasFullName(){
        assertEquals("Jim Carrey", person.getFullName());
    }
}
