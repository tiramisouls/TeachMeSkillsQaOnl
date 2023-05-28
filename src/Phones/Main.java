package Phones;

public class Main {

    public static void main(String[] args) {

        // Task 1
        Phone person1 = new Phone("+8800-5353-3535", "iPhone 11 ", 220.5);
        Phone person2 = new Phone("+375(29)-389-13-14", "Xiaomi 13 ", 195.7);
        Phone person3 = new Phone("+375(29)-696-23-18", "Samsung s22 ", 185.4);

        person1.getAllInfo();
        System.out.println();
        person2.getAllInfo();
        System.out.println();
        person3.getAllInfo();
        System.out.println();

        person1.receiveCall("Victoria");
        System.out.println();
        person2.receiveCall("Ivan", "+375(29)-336-18-28");
        System.out.println();
        person3.sendMessage("+375(29)-148-23-88", "+375(29)-197-15-33");
        System.out.println("\n");

    }
}