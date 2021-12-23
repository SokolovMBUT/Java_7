package task1;

import java.util.Scanner;

public class num4 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            a += 1;
        }
        else if(a<0) {
            a -= 2;
        }
        else{
            a=10;
        }
        System.out.println("a = " + a);
        }
}
