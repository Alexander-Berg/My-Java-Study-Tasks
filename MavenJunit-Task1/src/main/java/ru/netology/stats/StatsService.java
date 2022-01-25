package ru.netology.stats;

    public class StatsService {
    public static void main(String[] args) {
        maximum service = new maximum();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Maximum = service.maxSales(sales);
        System.out.println(Maximum);
    }
}

    class StatsService1 {
        public static void main(String[] args) {
            minimum service = new minimum();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long Minimum = service.minSales(sales);
            System.out.println(Minimum);
        }
    }


        class StatsService2 {
            public static void main(String[] args) {
                median service = new median();
                long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
                long Median = service.Midsales(sales);
                System.out.println(Median);
            }
        }


        class StatsService3 {
            public static void main(String[] args)
            {  sum service = new sum();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Sum = service.calculateSum(sales);
        System.out.println(Sum);
    }
}
         class StatsService4 {
             public static void main(String[] args) {
                 belowmedian service = new belowmedian();
                 long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
                 long NumberofMonths = service.belowmediansales(sales);
                 System.out.println(NumberofMonths);
             }
         }
         class StatsService5 {
                 public static void main(String[] args) {
        abovemedian service = new abovemedian();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long NumberofMonths1 = service.abovemediansales(sales);
        System.out.println(NumberofMonths1);
    }
}


