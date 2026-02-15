package math.divisor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfDivisor {
    // 약수의 합, https://www.acmicpc.net/problem/17425
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int MAX = 1000000;

        long[] f = new long[MAX+1];
        long[] g = new long[MAX+1];

        // 모든 수의 약수의 합 f
        Arrays.fill(f, 1);
        for (int i = 2; i <= MAX; i++) {
            for (int j = 1; i * j <= MAX; j++) {
                f[i * j] += i;
            }
        }

        // 누적 합
        for (int i = 1; i <= MAX; i++) {
            g[i] = g[i - 1] + f[i];
        }
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(g[N]).append('\n');
        }
        System.out.println(sb);
    }
}
