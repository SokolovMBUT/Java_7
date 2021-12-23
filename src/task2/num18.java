package task2;
//Напишите программу на Java, которая возвращает сумму цифр, присутствующих в строке. Если цифр нет, возвращаемая сумма равна 0.
import java.util.Scanner;

public class num18 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Сумма цифр, присутствующих в строке: " + sum);

    }

}

