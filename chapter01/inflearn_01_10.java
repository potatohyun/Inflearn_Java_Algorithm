package chapter01;

import java.util.Scanner;

public class inflearn_01_10 {
    public static void main(String[] args) {
        inflearn_01_10 T = new inflearn_01_10();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for (int i : T.lectureSolution(s, t)) {
            System.out.print(i + " ");
        }
//        System.out.println(T.lectureSolution(s, t));
    }

    public void solution(String s, char t) {
        // 못품. 강의봄
    }

    public int[] lectureSolution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t) {
                answer[i] = ++p;
            } else {
                p = 0;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (answer[i] == 0) p = 0;
            else if (answer[i] > p) {
                answer[i] = ++p;
            }
        }
        return answer;
    }
}


/*
설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

예시 입력 1
teachermode e

예시 출력 1
1 0 1 2 1 0 1 2 2 1 0

 */

