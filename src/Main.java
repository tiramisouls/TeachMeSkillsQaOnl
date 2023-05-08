import java.util.Scanner;
public class Main
{
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        scannerMyRecords();
        System.out.println();

        charToInt();
        System.out.println();

        calculateBMI();
        System.out.println();

        scanner.close();
    }

    //task1
        public static void scannerMyRecords()
        {
            System.out.print(" Enter your name: ");
            String name = scanner.nextLine();
            System.out.print(" Enter your surname: ");
            String surname = scanner.nextLine();
            System.out.print(" Enter your age: ");
            int age = scanner.nextInt();
            System.out.print(" Enter your height: ");
            int height = scanner.nextInt();
            System.out.print(" Enter your weight: ");
            double weight = scanner.nextDouble();

            System.out.println(" Name: " + name);
            System.out.println(" Surname: " + surname);
            System.out.println(" Age: " + age);
            System.out.println(" Height: " + height);
            System.out.println(" Weight: " + weight);

        }

     //task2
    public static void charToInt(){

        char mySymbol ='A';
        System.out.println("A -" + (int)mySymbol);
        char mySymbol1 ='C';
        System.out.println("C -" + (int)mySymbol1);

        }

     //task3
    public static void calculateBMI(){

        System.out.print(" Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print(" Enter height in centimeters: ");
        double height = scanner.nextDouble();
        double BMI = weight/(height*height)*(100*100);
        System.out.println(" BMI result: " + BMI + " kg/m2 ");
   }

}
