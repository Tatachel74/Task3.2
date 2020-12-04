public class Main {
    public static void main(String[] args) {
        int cash = 2000;
        int balance = 100;
        int bonus;
        int total;
        if (cash > 1000) {
            bonus = cash / 100;
            bonus = (int) cash / 100;
            total = balance + cash + bonus;
            System.out.println("Вам начислено " + bonus + " бонусов");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int cash = 200;
        int balance = 100;
        int bonus;
        int total;
        if (cash > 1000) {
            bonus = cash / 100;
            bonus = (int) cash / 100;
            total = balance + cash + bonus;
            System.out.println("Вам начислено " + bonus + " бонусов");
        } else {
            total = balance + cash;
        }
        System.out.println("Итоговый баланс: " + total);
    }
}

