import java.util.Scanner;
public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        switchOperator();
        elseIfOperator();
        evenNumber();
        outTemperature();
        rainbowColors();
        scanner.close();

    }

    //task1
    public static void switchOperator() {
        int month = 5;
        switch (month) {

            case 1:
                System.out.println(" Winter! ");
                break;
            case 2:
                System.out.println(" Winter! ");
                break;
            case 3:
                System.out.println(" Spring! ");
                break;
            case 4:
                System.out.println(" Spring! ");
                break;
            case 5:
                System.out.println(" Spring! ");
                break;
            case 6:
                System.out.println(" Summer! ");
                break;
            case 7:
                System.out.println(" Summer! ");
                break;
            case 8:
                System.out.println(" Summer! ");
                break;
            case 9:
                System.out.println(" Autumn! ");
                break;
            case 10:
                System.out.println(" Autumn! ");
                break;
            case 11:
                System.out.println(" Autumn! ");
                break;
            case 12:
                System.out.println(" Winter! ");
                break;

        }
    }

        //task2
        public static void elseIfOperator()
        {
            int month = 6;

            if (month == 12 || month == 1 || month == 2) {
                System.out.println(" Winter! ");
            }
            else if (month == 3 || month == 4 || month == 5) {
                System.out.println(" Spring! ");
            }
            else if (month == 6 || month == 7 || month == 8) {
                System.out.println(" Summer! ");
            }
            else {
                System.out.println(" Autumn! ");
            }
        }
        public static void evenNumber()
        {
        System.out.print(" Enter number: ");
        int num = scanner.nextInt();
        if ( num % 2 == 0) {

            System.out.println(" Even Number");
        }
        else {

            System.out.println(" Not Even Number ");
        }


        }

        public static void outTemperature(){
        int t = 15;
        if (t>14){
            System.out.println(" Warm ");
        }
        else if (t>=10){
            System.out.println(" Normally ");
        }
        else if (t<=5){
            System.out.println(" Cold ");
        }
        }

        public static void rainbowColors(){
        int color = 3;
        if (color==1){
            System.out.println(" Red ");
        }
        else if (color==2) {
            System.out.println(" Orange ");
        }
        else if (color==3){
            System.out.println(" Yellow ");

            }
        else if (color==4){
            System.out.println(" Green ");
        }
        else if (color==5){
            System.out.println(" Light blue ");
        }
        else if (color==6){
            System.out.println(" Blue ");
        }
        else if (color==7){
            System.out.println(" Violet ");
        }

        }


}


