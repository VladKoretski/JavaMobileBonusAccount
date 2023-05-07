//Импорт класса Scanner

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Начальное состояние счета
        float accountBalance = 120f;
        System.out.println("The customer has " + accountBalance + " roubles in they account");
//Объявление переменных (суммы пополнения и минимальной суммы для начисления бонусов) и ввод их значений с клавиатуры
        Scanner inData = new Scanner(System.in);
        System.out.println("Input the minimum deposit required for bonus accrual ");
        float minimumDeposite = inData.nextFloat();
        System.out.println("Input the deposit amount ");
        float accountFunding = inData.nextFloat();
        System.out.println("Input the bonus amount for a hundred roubles ");
        int bonusForHundredRoubles = inData.nextInt();
//Объявление переменных для определения статуса счета (после начисления депозита) и количества бонусов
        int bonusAmount = 0;
        float accountStatus;

        if (accountFunding>=minimumDeposite) {
            bonusAmount = (int) accountFunding / 100;
        }
        accountStatus = (float) accountBalance + bonusAmount + accountFunding;
        System.out.println("In account " + accountStatus + " roubles" + " including " + bonusAmount + " bonuses");
    }
}