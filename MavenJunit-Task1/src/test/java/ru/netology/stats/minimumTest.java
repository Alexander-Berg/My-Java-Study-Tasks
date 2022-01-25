package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class minimumTest {
    @org.junit.jupiter.api.Test
        void minimumTest1 ()
        {minimum service = new minimum();
            long[] sales = {1_000, 2_000, 500, 5_000, 2_000};
            long expected =3;
            long actual = service.minSales(sales);
            assertEquals(expected, actual);}

}