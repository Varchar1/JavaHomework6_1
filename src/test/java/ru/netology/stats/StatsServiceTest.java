package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void FirstConditionTest() {
        StatsService service = new StatsService();

        long[] sales = {-8, 15, 13, 15, 17, 20, 19, 20, 7, 0, 14, 18};

        int expected = 150;
        int actual = service.SalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SecondConditionTest() {
        StatsService service = new StatsService();

        long[] sales = {-8, 15, 13, 15, 17, 20, 19, 20, 7, 0, 14, 18};

        int expected = 12;
        int actual = service.MiddleSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ThirdConditionTest() {
        StatsService service = new StatsService();

        long[] sales = {-8, 15, 13, 15, 17, 20, 19, 20, 7, 0, 14, 18};

        int expected = 8;
        int actual = service.MaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FourthConditionTest() {
        StatsService service = new StatsService();

        long[] sales = {-8, 15, 13, 15, 17, 20, 19, 20, 7, 0, 14, 18};

        int expected = 1;
        int actual = service.MinMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FifthConditionTest() {
        StatsService service = new StatsService();

        long[] sales = {-8, 15, 13, 15, 17, 20, 19, 20, 7, 0, 14, 18};

        int expected = 3;
        int actual = service.LessThanMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SixthConditionTest() {
        StatsService service = new StatsService();

        long[] sales = {-8, 15, 13, 15, 17, 20, 19, 20, 7, 0, 14, 18};

        int expected = 9;
        int actual = service.MoreThanMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }
}
