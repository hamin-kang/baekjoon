package dataStructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class goodWord {
    // 좋은 단어, http://acmicpc.net/problem/3986
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfWord = sc.nextInt();
        int goodCount = 0;
        
        for(int i = 0; i < numOfWord; i++) {
            String word = sc.next();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if(stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if(stack.peek() == ch) {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
            if(stack.isEmpty()) {
                goodCount++;
            }
        }
        System.out.print(goodCount);
        sc.close();
    }
}
