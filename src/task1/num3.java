package task1;

import java.util.Scanner;

public class num3 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a + 1);
        } else {
            System.out.println(a);
        }
    }
}
