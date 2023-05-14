/*
Добро пожаловать. Это многолинейный комментарий. Пишем что хотим и сколько хотим.
 */

import java.util.Scanner;

// Главная реализация моего объекта это Класс
class Main
{
    public static void main(String[] args)
    {
        // Этот код выводит сообщение, one-line comment
        // Legacy Code - код написанный другим программистом и скорее всего
        // на старой версии языка
        // Java - это чаще всего 1.8 (Java 8)

        System.out.print("");
        System.out.println();

        Scanner user_input = new Scanner(System.in, "Cp1251");

        // new line - symbol, \n

        // This is an example comment for Git
        String first_name;
        System.out.print("введите имя: ");
        first_name = user_input.nextLine();

        String family_name;
        System.out.print("введите фамилию: ");
        family_name = user_input.nextLine();

        String full;
        full = first_name + " " + family_name;

        System.out.println("вас зовут " + full);

    }
}