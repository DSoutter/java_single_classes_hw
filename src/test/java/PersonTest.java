import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void before() {
        person = new Person("Jim", "Carrey", 59, 188);
    }

    @Test
    public void personHasFullName(){
        assertEquals("Jim Carrey", person.getFullName());
    }

    @Test
    public void personCanAge(){
        person.hasBirthday();
        assertEquals(60, person.getAge());
    }

    @Test
    public void personHeightIncreases(){
        person.hasBirthday();
        assertEquals(188.1, person.getHeight(), 0.01);
    }
}
