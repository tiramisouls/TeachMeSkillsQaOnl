package Cards;

public class CreditCard {


        private String accountNumber = " ";
        private int currentAmount;
        private int sum;

        public void setAccountNumber (String accountNumber){
            this.accountNumber = accountNumber;
        }

        public void setCurrentAmount ( int currentAmount){
            this.currentAmount = currentAmount;
        }

        public void setSum ( int sum){
            this.sum = sum;
        }

        void getCardInfo ()
        {
            System.out.println("Card account number: " + accountNumber);
            System.out.println("Current amount on the card: " + currentAmount);
        }
        void cashWithdrawal ()
        {
            System.out.println("Withdrawal from a credit card: " + sum);
            System.out.println("Current card balance: " + (currentAmount - sum));
        }
        void getRefill ()
        {
            System.out.println("Crediting funds to the card: " + sum);
            System.out.println("Current card balance: " + (currentAmount + sum));
        }

}