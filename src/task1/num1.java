package task1;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if ((a/10)>0) {
            System.out.println(a % 10);
        }
        else{
            System.out.println(a);
        }
    }
}
