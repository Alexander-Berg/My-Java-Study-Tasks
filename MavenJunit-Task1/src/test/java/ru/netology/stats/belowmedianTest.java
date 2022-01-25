package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class belowmedianTest {
    @org.junit.jupiter.api.Test
        void belowmedianTest1 ()
        {belowmedian service = new belowmedian();
            long[] sales = {1,2,5,5,2,7,9,6,4,3,3,5};
            long expected = 3;
            long actual = service.belowmediansales(sales);
            assertEquals(expected, actual);}

}