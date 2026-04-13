package greedy;

import java.util.Scanner;

public class Change {
    // 거스름돈, https://www.acmicpc.net/problem/5585
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        int change = 1000 - pay;
        int[] money = {1, 5, 10, 50, 100, 500};
        int count = 0;

        while (change > 0) {
            for (int i = 5; i >= 0; i--) {
                int a = change / money[i];
                if (a >= 1) {
                    count += a;
                    change %= money[i];
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
