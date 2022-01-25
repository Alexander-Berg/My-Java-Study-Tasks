package ru.netology.stats;

public class maximum  {public int maxSales(long[] sales) {
    int maxMonth = 0;
    int month = 0; // переменная для индекса рассматриваемого месяца в массиве
    for (long sale : sales) {
        // sales[maxMonth] - продажи в месяце maxMonth
        // sale - продажи в рассматриваемом месяце
        if (sale >= sales[maxMonth]) {
            maxMonth = month;
        }
        month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
    }
    return maxMonth + 1;
}
}