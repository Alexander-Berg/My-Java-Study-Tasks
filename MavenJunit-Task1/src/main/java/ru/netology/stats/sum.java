package ru.netology.stats;

public class sum {
    public long calculateSum(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }
}
