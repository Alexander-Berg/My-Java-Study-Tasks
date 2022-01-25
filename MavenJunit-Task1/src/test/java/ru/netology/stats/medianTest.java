package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class medianTest {
    @org.junit.jupiter.api.Test
        void medianTest1 ()
        {median service = new median();
            long [] sales = {1,2,5,5,2,7,9,6,4,3,3,5};
            float expected =4;
            long actual = service.Midsales(sales);
            assertEquals(expected, actual);}

}