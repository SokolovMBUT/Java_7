package task2;
//Написать программу, которая определяет, является ли строка палиндромом
import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        isPalindrome(s);
    }

    public static String reverseString(String s) { //метод изменяющий символы в строке
        String a = "";
        for (int i = s.length() - 1; i >= 0; --i) //берем символ сконца строки и добавляем его в начало
            a+=s.charAt(i);
        return a;

    }

    public static boolean isPalindrome(String s) {
        String reversedString = reverseString(s);
        if (s.equals(reverseString(s))) {           //сравниваем два слова
            System.out.println(("Палидром"));
        } else {
            System.out.println("Не палидром");
        }
        return s.equals(reverseString(s));
    }

}
