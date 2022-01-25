public class Main {
    public static void main(String[] args) {
        int account = 100;
                int amount = 1500;
                int limit  = 1000;
                int hundred = 100;
                long bonus = amount / hundred;
                long total = account + amount + bonus;
                if (amount <= limit) {total = account + amount;}

                System.out.println(total);




    }
}