package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class maximumTest {
        @org.junit.jupiter.api.Test
        void maximumTest1 ()
        {maximum service = new maximum();
            long[] sales = {1_000, 2_000, 500, 5_000, 2_000};
            long expected = 4;
            long actual = service.maxSales(sales);
            assertEquals(expected, actual);}

}