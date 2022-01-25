public class Main {

    public static void main(String[] args) {
        CreditPaymentService CreditPaymentService  = new CreditPaymentService();
        int Time;
        int amount;
        double Payment = CreditPaymentService.calculate(Time = 12, amount = 1000000);
        System.out.println(Payment);
        double Payment1 = CreditPaymentService.calculate(Time = 24, amount = 1000000);
        System.out.println(Payment1);
        double Payment2 = CreditPaymentService.calculate(Time = 36, amount = 1000000);
        System.out.println(Payment2);

    }
}