package task2;
//Напишите Java-программу, чтобы получить длину заданной строки.
import java.util.Scanner;

public class num10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int dl = str.length();
        System.out.println("Длина строки = " + dl);
    }
}
