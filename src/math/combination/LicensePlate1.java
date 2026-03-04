package math.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LicensePlate1 {
    // 차량 번호판 1, https://www.acmicpc.net/problem/16968
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        char[] charArray = numbers.toCharArray();
        int result = 1;

        // 첫번째 자리의 경우의 수
        if (charArray[0] == 'd') {
            result *= 10;
        } else if (charArray[0] == 'c') {
            result *= 26;
        }
       
        for (int i = 1; i < numbers.length(); i++) {
            if (charArray[i - 1] == charArray[i]) {
                if (charArray[i] == 'd') {
                    result *= 9;
                } else if (charArray[i] == 'c') {
                    result *= 25;
                }
            } else {
                if (charArray[i] == 'd') {
                    result *= 10;
                } else if (charArray[i] == 'c') {
                    result *= 26;
                }
            }
        }
        System.out.println(result);
    }
}
