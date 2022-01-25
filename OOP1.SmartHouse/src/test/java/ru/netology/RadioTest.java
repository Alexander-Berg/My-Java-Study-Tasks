package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void getCurrentRadio() {
        Radio Radio = new Radio();
        assertEquals(5, Radio.CurrentVolume);

    }

    @Test
    public void setCurrentRadio() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.CurrentRadio);

    }

    @Test
    public void getCurrentVolume() {
        Radio Radio = new Radio();
        assertEquals(5, Radio.CurrentVolume);

    }

    @Test
    public void setCurrentVolume() {
        Radio Radio = new Radio();
        assertEquals(7, Radio.CurrentVolume);


    }



    }
