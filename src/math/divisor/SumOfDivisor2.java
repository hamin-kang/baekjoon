package math.divisor;

import java.util.Scanner;

public class SumOfDivisor2 {
    // 약수의 합 2, https://www.acmicpc.net/problem/17427
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += ((int) N / i) * i;
        }
        System.out.println(sum);

        sc.close();
    }
}