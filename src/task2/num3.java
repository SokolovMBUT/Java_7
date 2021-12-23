package task2;
//Реализовать проверку, являются ли две строки анаграммами
import java.util.Scanner;

public class num3{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        // преобразуем строки в символы
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        if (str1.length() != str2.length()){
            System.out.println("Не анаграммы");
        }
        else {
            for (int i = 0; i < str1.length(); i++){
                for (int j = i; j < str2.length(); j++){
                    if (s1[i] != s2[j]){
                        System.out.println("Не анаграммы");
                    }
                    else {
                        System.out.println("Анаграммы");
                    }
                }
            }
        }

    }
}
