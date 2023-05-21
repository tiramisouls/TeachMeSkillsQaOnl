package Cards;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args)
    {

        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();


        card1.setAccountNumber("1448 2313 4514 9847");
        card1.setCurrentAmount(1000);
        card1.getCardInfo();
        System.out.println();
        System.out.print("Введите сумму для зачисления на карту : ");
        card1.setSum(input().nextInt());

        card2.setAccountNumber("2288 0041 5429 7313");
        card2.setCurrentAmount(1200);
        card2.getCardInfo();
        System.out.println();
        System.out.print("Введите сумму для зачисления на карту : ");
        card2.setSum(input().nextInt());

        card3.setAccountNumber("1341 0269 7611 9966");
        card3.setCurrentAmount(1400);
        card3.getCardInfo();
        System.out.println();
        System.out.print("Введите сумму для снятия с карты : ");
        card3.setSum(input().nextInt());


        System.out.println();
        card1.getRefill();
        System.out.println();
        card2.getRefill();
        System.out.println();
        card3.cashWithdrawal();


    }
    public static Scanner input () {
        return new Scanner(System.in);

    }
}
