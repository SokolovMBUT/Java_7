package task1;

public class num10 {
    public static void main(String[] args) {
        int[] mass = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int n = mass.length;
        for (int i = 0; i < n ; i++) {
            if (mass[i] == 0) {
                for (int j = i; j < n - 1; j++) {
                    int t = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}

