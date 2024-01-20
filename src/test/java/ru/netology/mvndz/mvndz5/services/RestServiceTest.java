package ru.netology.mvndz.mvndz5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.mvndz.mvndz5.services.RestService;

public class RestServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testsalaryless(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println("1. " + expected + " == ? ==" + actual);

        Assertions.assertEquals(expected, actual);
    }


//   @Test
//   public void testsalaryhigher() {
//       RestService service = new RestService();
//
//       int expected = 2;
//       int actual = service.calculate(100000, 60000, 150000);
//      //System.out.println("1. " + expected + " == ? ==" + actual);
//
//       Assertions.assertEquals(expected, actual);
//    }
}
