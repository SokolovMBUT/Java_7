package task1;

import java.util.Scanner;

public class num5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        if ((a<=b) & (a<=c)) {
            System.out.println("Наименьшее число = " + a);
        }
        if ((b<a) & (b<=c)){
            System.out.println("Наименьшее число = " + b);
        }
        if ((c<a) & (c<b)){
            System.out.println("Наименьшее число = " + c);
        }
        }
}
