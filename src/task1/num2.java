package task1;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int a = scanner.nextInt();
        int s1 = a % 10;
        int s2 = (a % 100)/10;
        int s3 = a / 100;
        int s = s1 + s2 + s3;
        System.out.println("Сумма цифр = " + s);
    }
}
