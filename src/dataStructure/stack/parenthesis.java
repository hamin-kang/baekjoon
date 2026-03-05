package dataStructure.stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class parenthesis {
    // 괄호, https://www.acmicpc.net/problem/9012
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String input;

        for (int i = 0; i < T; i++) {
            input = sc.nextLine();
            int count = 0;
            char[] array = input.toCharArray();
            
            for (char c : array) {
                if (c == '(') {
                    stack.push(c);
                    count++;
                } else if (c == ')') {
                    stack.push(c);
                    count--;
                }

                if (count == -1) {
                    break;
                }
            }

            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
