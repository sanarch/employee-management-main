import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testAnnualSalary() {

        Employee emp = new Employee("John", 50000);

        assertEquals(600000, emp.calculateAnnualSalary(), 0.01);
    }

    @Test
    public void testValidEmployee() {

        Employee emp = new Employee("John", 50000);

        assertTrue(emp.isValidEmployee());
    }

    @Test
    public void testInvalidSalary() {

        Employee emp = new Employee("John", -5000);

        assertFalse(emp.isValidEmployee());
    }

    @Test
    public void testEmptyName() {

        Employee emp = new Employee("", 50000);

        assertFalse(emp.isValidEmployee());
    }
}