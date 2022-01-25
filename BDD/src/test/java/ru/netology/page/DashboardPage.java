package ru.netology.page;

public class DashboardPage {
    // к сожалению, разработчики не дали нам удобного селектора, поэтому так
    private ElementsCollection cards = $$(".list__item");
    private final String balanceStart = "баланс: ";
    private final String balanceFinish = " р.";

    public Dashboard() {
    }

    public int getFirstCardBalance() {
        val text = cards.first().text();
        return extractBalance(text);
    }

    private int extractBalance(String text) {
        val start = text.indexOf(balanceStart);
        val finish = text.indexOf(balanceFinish);
        val value = text.substring(start + balanceStart.length(), finish);
        return Integer.parseInt(value);
    }


    // к сожалению, разработчики не дали нам удобного селектора, поэтому так
    private ElementsCollection cards = $$(".list__item");
    private final String balanceStart = "баланс: ";
    private final String balanceFinish = " р.";

    public Dashboard() {
    }

    public int getCardBalance(String id) {
        // TODO: перебрать все карты и найти по атрибуту data-test-id
        return extractBalance(text);
    }

    private int extractBalance(String text) {
        val start = text.indexOf(balanceStart);
        val finish = text.indexOf(balanceFinish);
        val value = text.substring(start + balanceStart.length(), finish);
        return Integer.parseInt(value);
    }
}
