import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        getNumberSearch();

    }
    public static void getNumberSearch() {
        //Входит ли введенное число в массив task 0
        System.out.print("Enter an integer: ");
        Scanner enter = new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count = 0;
        int[] myArray = new int[]{7, 54, -7, 1000, -15, 19, 58, 114, 12, 61};
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] == myNumb)
                count++;

        }
        if (count > 0)
            System.out.println("Enter the number included in the array");
        else
            System.out.println("Enter a number not in the array");


        enter.close();

    }
}



