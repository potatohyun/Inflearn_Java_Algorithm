package chapter05_stackAndQueue;

import java.util.*;

public class inflearn_05_01 {
    public static void main(String[] args) {
        inflearn_05_01 T = new inflearn_05_01();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.lectureSolution(str));
    }

    public String solution(String str) {
        String answer = "NO";
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (st.isEmpty()) st.push(c);
            else {
                if (st.peek()=='(' && c ==')') st.pop();
                else st.push(c);
            }
        }
        if (st.isEmpty()) return "YES";
        return answer;
    }

    public String lectureSolution(String str) {
        // stack을 쓰면서 for으로 순회하는건 똑같음. 근데 접근하는 조건문이 간결하면서 신박함.
        String answer = "NO";
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c=='(') st.push(c);
            else {
                if (st.isEmpty()) return answer; // ')'가 먼저 들어가면 안된다는 점을 이용.
                st.pop(); // 앞에서 자연스레 불일치하는 조건을 해결해줬으니까 여기는 당연히 조건에 일치하는 경우만 옴. 그러니까 그냥 pop만 해줘도 됨.
            }
        }
        if (st.isEmpty()) return "YES";
        return answer;
    }
}

/*
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.

예시 입력 1
(()(()))(()

예시 출력 1
NO
 */

