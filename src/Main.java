public class Main {
    public static void main(String[] args) {

//Начальное состояние счета
        float accountBalance = 120f;
        System.out.println("The customer has " + accountBalance + " roubles in they account");

//Объявление переменных (суммы пополнения и минимальной суммы для начисления бонусов) и ввод их значений с клавиатуры
        int minimumDeposite = 500;
        System.out.println("The minimum deposit required for bonus accrual = " + minimumDeposite + " roubles");
        float accountFunding = 355;
        int bonusForHundredRoubles = 1;
        System.out.println("The amount of bonus for a hundred roubles = " + bonusForHundredRoubles + " rouble(s)");
        System.out.println("The amount of deposit = " + accountFunding + " roubles");

//Объявление переменных для определения статуса счета (после начисления депозита) и количества бонусов
        int bonusAmount = 0;
        float accountStatus;

        if (accountFunding >= minimumDeposite) {
            bonusAmount = (int) accountFunding / 100;
        }
        accountStatus = (float) accountBalance + bonusAmount + accountFunding;
        System.out.println("In account " + accountStatus + " roubles" + " including " + bonusAmount + " bonuses");
    }
}