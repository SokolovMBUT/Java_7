package task2;
//Напишите программу на Java, чтобы преобразовать все символы строки в нижний регистр
import java.util.Scanner;

public class num11 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.toLowerCase();
        System.out.println(str2);
    }
}
