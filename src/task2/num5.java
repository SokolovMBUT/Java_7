package task2;
//Напишите Java-программу для лексикографического сравнения двух строк, игнорируя различия в регистре
import java.util.Scanner;

public class num5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0){
            System.out.println("\"" + str1 + "\"" + " меньше " + "\"" + str2 + "\"");
        }
        else if (result == 0){
            System.out.println("\"" + str1 + "\"" + " равно " + "\""+ str2 + "\"");
        }
        else {
            System.out.println("\"" + str1 + "\"" +  " больше " + "\"" + str2 + "\"");
        }
    }
}
