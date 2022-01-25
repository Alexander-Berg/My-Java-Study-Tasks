public class Main {

    public static void main(String[] args) {
        BmiService BmiService = new BmiService();
        long Weigh;
        long High;
        double Index = BmiService.calculate(Weigh = 70, High = 180);
        System.out.println(Index);
    }
}