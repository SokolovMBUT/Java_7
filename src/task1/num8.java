package task1;

public class num8 {
    public static void main(String[] args) {
        int[] mass = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = mass[1];
        int sum1 = 0;
        int k1 = 0;
        int sum2 = 0;
        double sum3 = 0;
        double k2 = 0;
        for (int i = 0; i < 14; i++) {
            if (mass[i] > max){
                max = mass[i];
            }
            if (mass[i]>0){
                sum1+=mass[i];
                k1+=1;
            }
            if (mass[i]<0 & mass[i]%2==0){
                sum2+=mass[i];
            }
            if (mass[i]<0){
                k2+=1;
                sum3+=mass[i];
            }
        }
        double sr_ar = sum3 / k2;

        System.out.println("max = " + max);
        System.out.println("Сумма положительных элементов = " + sum1);
        System.out.println("Сумма четных отрицательных элементов = " + sum2);
        System.out.println("Количество положительных элементов = " + k1);
        System.out.println("Среднее арифметическое отричательных элементов = " + sr_ar);
    }
}
