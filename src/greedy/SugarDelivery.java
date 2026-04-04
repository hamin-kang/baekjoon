package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {
    // 설탕 배달, https://www.acmicpc.net/problem/2839
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numOf5=0, numOf3=0;
        while (N > 0) {
            if (N % 5 == 0) {
                numOf5 = N / 5;
                break;
            } else {
                numOf3++;
                N -= 3;
            }
        }

        if (N >= 0) {
            System.out.println(numOf5 + numOf3);
        } else if (N < 0) {
            System.out.println(-1);
        }
    }
}
