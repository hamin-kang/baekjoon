package math.divisor;

import java.util.Scanner;

public class Divisor {
    // 약수, https://www.acmicpc.net/problem/1037
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = sc.nextInt();
        int max = temp, min = temp;

        for (int i = 1; i < num; i++) {
            temp = sc.nextInt();
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(min * max);

        sc.close();
    }
}
