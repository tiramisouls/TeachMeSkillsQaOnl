import java.util.Scanner;
public class Main
{
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ScannerMyRecords();
        System.out.println();

        CharToInt();
        System.out.println();

        calculateBMI();
        System.out.println();

        scanner.close();
    }

    //task1
        public static void ScannerMyRecords()
        {
            System.out.print(" Enter your name: ");
            String name = scanner.nextLine();
            System.out.print(" Enter your surname: ");
            String surname = scanner.nextLine();
            System.out.print(" Enter your age: ");
            String age = scanner.nextLine();
            System.out.print(" Enter your height: ");
            String height = scanner.nextLine();
            System.out.print(" Enter your weight: ");
            String weight = scanner.nextLine();

            System.out.println(" Name: " + name);
            System.out.println(" Surname: " + surname);
            System.out.println(" Age: " + age);
            System.out.println(" Height: " + height);
            System.out.println(" Weight: " + weight);

        }

     //task2
    public static void CharToInt(){

        char mySymbol ='A';
        System.out.println("A -" + (int)mySymbol);
        char mySymbol1 ='C';
        System.out.println("C -" + (int)mySymbol1);

        }

     //task3
    public static void calculateBMI(){

        System.out.print(" Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print(" Enter height in meters: ");
        double height = scanner.nextDouble();
        double BMI = weight/(height*height);
        System.out.println(" BMI result: " + BMI + " kg/m2 ");
   }

}
