package task2;
//Напишите программу на Java, которая возвращает количество символов, появляющихся три раза подряд в строке.
import java.util.Scanner;

public class num17 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] s = str.toCharArray();
        int kol = 0;
        for (int i = 0; i < str.length()-2; i++){
            if ((s[i] == s[i+1])&(s[i] == s[i+2])){
                kol+=1;
            }
        }
        System.out.println("Количество символов, появляющихся три раза подряд в строке: " + kol);
    }
}
