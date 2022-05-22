package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    public void findMaxHugeValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 15, 120, 88, 7, 5_000_000, 20, 20, 13, 480, 60, 10};
        long expected = 5_000_000;

        long actual = service.findMax(incomesInBillions);
    }
}
