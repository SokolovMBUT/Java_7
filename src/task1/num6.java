package task1;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Положительно честное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        } else if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("Отрицательно четное число");
            } else {
                System.out.println("Отричательное нечетное число");
            }
        } else {
            System.out.println("Нулевое число");
        }
    }
}
