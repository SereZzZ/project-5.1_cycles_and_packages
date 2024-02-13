package ru.netology.services.QAdz5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void HowManyVacations(int expected, int income, int expenses, int threshold) {
        FreeService service = new FreeService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
