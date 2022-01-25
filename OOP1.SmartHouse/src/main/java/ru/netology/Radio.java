package ru.netology;

public class Radio {
    Radio Radio = new Radio();
    public String name;


    public int getCurrentRadio() {
        return CurrentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        CurrentRadio = currentRadio;
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        CurrentVolume = currentVolume;
    }

    public int CurrentRadio;
    private int MaxVolume;
    private int MinVolume;
    public int CurrentVolume;
    private boolean on;

    class VolumeMassive {
        VolumeMassive service = new VolumeMassive;


        {
            int[] Volume = {1, 2, 3, 4, 6, 7, 5, 8, 9, 10};


            public void IncreaseVolume {
            for (int CurrentVolume : Volume)

                if (CurrentVolume < 10) {
                    CurrentVolume = CurrentVolume + 1;
                } else {
                    CurrentVolume = 10;
                    System.out.println(CurrentVolume);
                }
        }
        }
    }


    public void DecreaseVolume() {
        if (CurrentVolume > 1) {
            CurrentVolume = CurrentVolume - 1;
        } else {
            CurrentVolume = 1;
            System.out.println(CurrentVolume);
        }

    }


    class RadiostationMassive {
        RadiostationMassive service = new RadiostationMassive;

        {
            int[] RadioStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            public void Next () {
            for (int CurrentRadio : RadioStation)
                if (CurrentRadio < 9) {
                    CurrentRadio = CurrentRadio + 1;
                } else CurrentRadio = 0;
            System.out.println(CurrentRadio);
        }


            public void Prev () {
            if (CurrentRadio > -1) {
                CurrentRadio = CurrentRadio - 1;
            } else CurrentRadio = 10;
            System.out.println(CurrentRadio);
        }
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }


    }
}








