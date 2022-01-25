package ru.netology.stats;

public class median {
        public int Midsales(long[] sales) {

                long sum = 0;
                for (long sale : sales) {
                    sum += sale;
                }
         long months = 12;
            long Medium = sum / months;
            return (int) Medium;
        }
}

