import junit.framework.Assert;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * The class that holds all unit tests for
 * the EmployeeService class.
 *
 * @author Deep Shah
 */


@RunWith(PowerMockRunner.class)
@PrepareForTest(Employee.class)
public class EmployeeServiceTest {

    @Test
    public void shouldReturnTrueWhenIncrementOf10PercentageIsGivenSuccessfully() {
        PowerMockito.mockStatic(Employee.class);

        PowerMockito.doNothing().when(Employee.class);
        Employee.giveIncrementOf(10);

        EmployeeService employeeService = new EmployeeService();
        Assert.assertTrue(employeeService.giveIncrementToAllEmployeesOf(10));
    }

    @Test
    public void shouldReturnFalseWhenIncrementOf10PercentageIsNotGivenSuccessfully() {
        PowerMockito.mockStatic(Employee.class);

        PowerMockito.doThrow(new IllegalStateException()).when(Employee.class);
        Employee.giveIncrementOf(10);

        EmployeeService employeeService = new EmployeeService();
        Assert.assertFalse(employeeService.giveIncrementToAllEmployeesOf(10));
    }
}