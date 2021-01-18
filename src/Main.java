public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transaction = 300;
        int bonusCost = 100;
        int minTransactionForBonus = 1000;
        int bonus;
        if (transaction >= minTransactionForBonus) {
            bonus = transaction / bonusCost;
        } else {
            bonus = 0;
        }
        balance = balance + transaction + bonus;
        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Итоговый баланс: " + balance);
    }
}
