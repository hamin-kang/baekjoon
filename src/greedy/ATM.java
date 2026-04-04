package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    // ATM, https://www.acmicpc.net/problem/11399
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[N];

        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);
        int sum=0, res=0;
        for (int i = 0; i < N; i++) {
            sum += p[i];
            res += sum;
        }
        System.out.println(res);
    }
}
