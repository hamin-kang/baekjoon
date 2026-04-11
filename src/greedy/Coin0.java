package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin0 {
    // 동전 0, https://www.acmicpc.net/problem/11047
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N+1];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N; i > 0; i--) {
            if (K - A[i] >= 0) {
                count += (int) K / A[i];
                K = K % A[i];
            }
        }
        
        System.out.println(count);
    }
}
