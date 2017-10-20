import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * The class that holds all unit tests for
        * the EmployeeController class.
        * @author: Deep Shah
        */
public class EmployeeControllerTest {

    @Test
    public void shouldGetCountOfEmployees() {
        EmployeeController employeeController = new EmployeeController(new EmployeeService());
      //  Assert.assertEquals(10,employeeController.getEmployeeCount());
    }
}