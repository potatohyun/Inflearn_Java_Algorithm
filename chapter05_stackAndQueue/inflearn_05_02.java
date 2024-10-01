package chapter05_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class inflearn_05_02 {
    public static void main(String[] args) {
        inflearn_05_02 T = new inflearn_05_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (st.isEmpty()) st.push(c);
            else {
                if (c ==')') {
                    while (st.pop() != '(');
                }else st.push(c);
            }
        }
        for (char c: st){
            answer.append(c);
        }
        return answer.toString();
    }

    public String lectureSolution(String str) {
        // 풀이 동일
        return "";
    }
}

/*
설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.

예시 입력 1
(A(BC)D)EF(G(H)(IJ)K)LM(N)

예시 출력 1
EFLM
 */

