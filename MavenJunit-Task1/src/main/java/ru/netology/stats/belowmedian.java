package ru.netology.stats;

public class belowmedian {
    public long belowmediansales(long[] sales) {
        long below1 = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int months = 12;
        long Medium = sum / months;
        for (long below : sales) {
            if (below< Medium) {
                below1= below;
            }
        }

        return below1;
    }
}






