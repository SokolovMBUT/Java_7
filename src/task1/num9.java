package task1;

public class num9 {
    public static void main(String[] args) {
        int[] mass = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        int n = mass.length;
        for (int i = 0; i < n / 2; i++) {
            int t = mass[n - i - 1];
            mass[n - i - 1] = mass[i];
            mass[i] = t;
        }
        for (int i = 0; i < 14; i++) {
            System.out.print(mass[i]+" ");
        }
    }
}
