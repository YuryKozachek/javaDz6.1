package ru.netology.sqr.javaDz.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqsService.csv")
    public void SqrtService(int expected, int numOne, int numTwo) {
        SQRService service = new SQRService();
        int actual = service.sqrtCalc(numOne, numTwo);
        Assertions.assertEquals(expected, actual);
    }

}
