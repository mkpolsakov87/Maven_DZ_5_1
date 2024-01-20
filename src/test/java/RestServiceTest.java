import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void testsalaryless() {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        //System.out.println("1. " + expected + " == ? ==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testsalaryhigher() {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        //System.out.println("1. " + expected + " == ? ==" + actual);

        Assertions.assertEquals(expected, actual);
    }
}
