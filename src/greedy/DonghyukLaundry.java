package greedy;

import java.util.Scanner;

public class DonghyukLaundry {
    // 세탁소 사장 동혁, https://www.acmicpc.net/problem/2720
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] test = new int[T];
        int[] cent = {1, 5, 10, 25}; // 페니, 니켈, 다임, 쿼터(센트단위)

        for (int i = 0; i < T; i++) {
            test[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {
            for (int j = 3; j >= 0; j--) {
                int x = test[i] / cent[j];
                if (x >= 1) {
                    System.out.print(x + " ");
                    test[i] %= cent[j];
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
