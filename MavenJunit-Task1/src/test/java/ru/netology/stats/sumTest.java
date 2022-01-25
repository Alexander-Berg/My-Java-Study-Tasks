package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class sumTest {
    @org.junit.jupiter.api.Test
    void calculateSum()
    {sum service = new sum();
        long[] sales = {1_000, 2_000, 500, 5_000, 2_000};
        long expected = 10_500;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }


}