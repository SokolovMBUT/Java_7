package task1;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код города");
        int a = scanner.nextInt();
        if (a == 905) {
            System.out.println("Москва. Стоимость разговора: 41.5");
        }
        if (a == 194) {
            System.out.println("Ростов. Стоимость разговора 19.8");
        }
        if (a == 491) {
            System.out.println("Краснодар. Стоимость разговора 26.9");
        }
        if (a == 800) {
            System.out.println("Киров. Стоимость разговора 50.0");
        }
    }
}
