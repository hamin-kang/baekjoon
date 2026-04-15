package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {
    // 주유소, https://www.acmicpc.net/problem/13305
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 도시의 개수
        int[] distance = new int[N-1]; // 거리
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int minimum = 0; // 최소 비용
        
        for (int i = 0; i < N-1; i++) {
            distance[i] = Integer.parseInt(st1.nextToken());
        }

        int[] wonPerLiter = new int[N]; // 리터당 가격
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            wonPerLiter[i] = Integer.parseInt(st2.nextToken());
        }

        minimum += wonPerLiter[0] * distance[0];

        for (int i = 1; i < N-1; i++) {
            if (wonPerLiter[i-1] > wonPerLiter[i]) {
                minimum += wonPerLiter[i] * distance[i];
            } else {
                minimum += wonPerLiter[i-1] * distance[i];
            }
        }

        System.out.println(minimum);

    }
}
