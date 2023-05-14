import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        getNumberSearch();
        getDeleting();
        getAverage();
        createMassAvgNumbersOfArrays();

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

    }

    // удалениее числа из массива task 1
    public static void getDeleting()
    {
        System.out.print("Enter an integer: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count =0;
        int[] myArray= new int[] {7, 54, -7, 1000, -15, 19, 58, 114, 12, 61};
        int[] myArray1 = new int[myArray.length];
        for (int index=0; index<myArray.length;index++)
        {
            if (myArray[index]==myNumb)
            {
                count++;
            }else
                myArray[index-count]=myArray[index];
        }
        if (count==0)
        {
            System.out.println("There is no such number in the array");
            return;
        }
        for (int index =0; index<myArray1.length;index++)
            myArray1[index]=myArray[index];
        for (int index =0; index<myArray1.length-count;index++)
            System.out.print(myArray1[index]+" ");

    }

    public static void getAverage()
    {
        System.out.println(" " +
                " ");
        //поиск мин-макс и сред значения task 2
        System.out.print("Enter the length of the array: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int myMax =0;
        int myMin =0;
        int mySum=0;
        int[] myArray2= new int[myNumb];
        for (int index=0; index<myArray2.length;index++)
            myArray2[index]=(int) (Math.random()*myNumb);
        for (int index=0; index<myArray2.length;index++)
            System.out.print(myArray2[index]+" ");
        System.out.println();
        for (int index=0; index<myArray2.length;index++)
            if(myArray2[index] > myMax)
                myMax=myArray2[index];
        System.out.println("Максимальный элемент массива: "+myMax);
        for (int index=0; index<myArray2.length;index++)
            myMin=myArray2[0];
        for (int index=1; index<myArray2.length;index++)
            if(myMin>myArray2[index])
                myMin=myArray2[index];
        System.out.println("Минимальный элемент массива: "+myMin);
        for (int index=1; index<myArray2.length;index++)
            mySum+=myArray2[index];
        double myAverage=mySum/myNumb;
        System.out.println("Среднее арифметическое всех элементов массива: "+myAverage);
        enter.close();

    }

    // task 3
    public static void createMassAvgNumbersOfArrays() {
        int sum1 = 0;
        int sum2 = 0;
        double avg1 = 0;
        double avg2 = 0;

        int[] array1 = new int[]{1, 2, 8, 36, 22};
        int[] array2 = new int[]{1, 7, 9, 78, 11};

        System.out.print (" Числа 1: ");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index] + " ");
        }

        System.out.println();

        System.out.print(" Числа 2: ");
        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index] + " ");
        }
        System.out.println();

        for (int index = 0; index < array1.length; index++) {
            sum1 += array1[index];
        }
        avg1 = (double) sum1 / array1.length;

        for (int index = 0; index < array2.length; index++) {
            sum2 += array2[index];
        }
        avg2 = (double) sum2 / array2.length;

        String result = (avg1 > avg2) ? " среднее арифметическое чисел 1 больше " : (avg1 < avg2) ?
                " среднее арефметическое чисел 2 больше " : " средние значения чисел равны ";
        System.out.println(result);
    }
}



