package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    int MaxRadiostation;
            int MinRadiostation;
                    int CurrentRadioStation;
    int Maxvolume;
            int Minvolume;
                    int Currentvolume;
                    boolean on = true;
int Radiostations[];
int Volume [];
}