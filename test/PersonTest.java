import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {
        p1 = new Person("CJ", "B", "000001", "Mr.", 2003);
        p2 = new Person("Howard", "W", "000002", "Mr.", 1997);
        Person.setIDSeed(0);
        p3 = new Person("Harry", "K", "Mr.", 2003);
        p4 = new Person("Timmy", "J",  "Mr.", 1998);
        p5 = new Person("Denim", "N",  "Mr.", 1990);
        p6 = new Person("Sarah", "T", "Ms.", 2000);
    }


    @Test
    void setIDSeed() {
        p1.setIDSeed(5);
        assertEquals(5, p1.getIDSeed());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Tim");
        assertEquals("Tim", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Powers");
        assertEquals("Powers", p1.getLastName());
    }

    @Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setTitle() {
        p1.setTitle("Mr.");
        assertEquals("Mr.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(1999);
        assertEquals(1999, p1.getYOB());
    }

    @Test
    void fullName() {
        assertEquals(p1.getFirstName() + " " + p1.getLastName(), p1.fullName());
    }

    @Test
    void formalName() {
    }

    @Test
    void toCSVDataRecord() {
    }
}