package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostParentheses {
    // 잃어버린 괄호, https://www.acmicpc.net/problem/1541
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] str = input.split("-");
        int n = str.length;
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            String[] nums = str[i].split("\\+");
            int m = nums.length;
            for (int j = 0; j < m; j++) {
                sum[i] += Integer.parseInt(nums[j]);
            }
        }

        int result = sum[0];

        for (int i = 1; i < n; i++) {
            result -= sum[i];
        }

        System.out.println(result);
    }
}
