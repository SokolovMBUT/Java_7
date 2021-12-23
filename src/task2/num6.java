package task2;
//Напишите программу на Java для объединения данной строки в конец другой строки.
import java.util.Scanner;

public class num6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        StringBuilder str = new StringBuilder(scanner.nextLine());
        str.append(str1);
        System.out.println(str);

    }
}
