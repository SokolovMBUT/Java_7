package task2;
//Напишите программу на Java, чтобы преобразовать все символы в строке в верхний регистр.
import java.util.Scanner;

public class num12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.toUpperCase();
        System.out.println(str2);
    }
}
