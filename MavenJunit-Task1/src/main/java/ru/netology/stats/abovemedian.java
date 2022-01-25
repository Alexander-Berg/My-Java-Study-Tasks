package ru.netology.stats;

public class abovemedian {
    public long abovemediansales(long[] sales) {
        long above1 = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int months = 12;
        long Medium = sum / months;
        for (long above : sales) {
            if (above > Medium) {
                above1 = above ;
            }
        }
 return above1;
    }
}