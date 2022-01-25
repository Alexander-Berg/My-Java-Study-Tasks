public class BmiService {
    public double calculate(long Weigh, long High) {
        double hundred = 100;
        double High1 = High / hundred;
        double Index =  Weigh / (High1 * High1);
    return Index;
}

}


