public class CreditPaymentService {

    public double calculate(long time, long amount) {
            double percent = 109.99;
            int hundred = 100;
            double Payment = ((amount / hundred) * percent) / time;
            return Payment;
        }

    }

