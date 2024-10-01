package chapter05_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class inflearn_05_04 {
    public static void main(String[] args) {
        inflearn_05_04 T = new inflearn_05_04();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(T.solution(n));
    }

    public int solution(String n) {
        Stack<Integer> st = new Stack<>();
        for (char c : n.toCharArray()) {
            int tmp = Character.getNumericValue(c);
            if (Character.isDigit(c)) st.push(tmp);
            else {
                int b = st.pop();
                int a = st.pop();
                switch (c) {
                    case '+':
                        st.push(a + b);
                        break;
                    case '-':
                        st.push(a - b);
                        break;
                    case '*':
                        st.push(a * b);
                        break;
                    case '/':
                        st.push(a / b);
                        break;
                }
            }
        }
        return st.pop();
    }

    public int lectureSolution(String n) {
        // 풀이 동일. 차이점은 char -> int 변환방법이 유니코드 기준값인 48을 빼줘서변환해줬다는거? 그거랑 switch가 아니라 if문으로 했다는거.
        int answer = 0;
        return answer;
    }
}

/*
설명
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

출력
연산한 결과를 출력합니다.

예시 입력 1
352+*9-

예시 출력 1
12
 */

