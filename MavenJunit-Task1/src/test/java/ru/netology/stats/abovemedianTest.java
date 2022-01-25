package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class abovemedianTest {
    @org.junit.jupiter.api.Test
    void abovemedianTest1 ()
    {abovemedian service = new abovemedian();
        long[] sales = {1,2,5,5,2,7,9,6,4,3,3,5};
        long expected = 5;
        long actual = service.abovemediansales(sales);
        assertEquals(expected, actual);}


}