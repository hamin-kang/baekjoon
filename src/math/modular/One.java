package math.modular;

import java.util.Scanner;

public class One {
    // 1, https://www.acmicpc.net/problem/4375
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int x = 0;
            for (int i=1;;i++) {
                x = ((x * 10) + 1) % n;
                if (x == 0) {
                    System.out.println(i);
                    break;
                }
            }            

        }
        sc.close();
    }
}
