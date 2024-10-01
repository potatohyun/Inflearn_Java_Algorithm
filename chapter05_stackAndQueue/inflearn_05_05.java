package chapter05_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class inflearn_05_05 {
    public static void main(String[] args) {
        inflearn_05_05 T = new inflearn_05_05();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(T.solution(n));
    }

    public int solution(String n) {
        int answer = 0;
        char pre = ' ';
        Stack<Character> st = new Stack<>();
        for (char c : n.toCharArray()){
            if (c == '(') st.push(c);
            else {
                // 레이저
                if (st.peek() == '(' && pre =='('){
                    st.pop();
                    answer+= st.size();
                }
                // 끝부분
                else {
                    answer++;
                    st.pop();
                }
            }
            pre = c;
        }
        return answer;
    }

    public int lectureSolution(String n) {
        // 비슷함.
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i)=='(') st.push('(');
            else {
                st.pop();
                if (n.charAt(i-1)=='(') answer+= st.size();
                else answer++;
            }
        }
        return answer;
    }
}

/*
설명
본문참고

예시 입력 1
()(((()())(())()))(())

예시 출력 1
17

예시 입력 2
(((()(()()))(())()))(()())

예시 출력 2
24

 */

