package chapter05_stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class inflearn_05_07 {
    public static void main(String[] args) {
        inflearn_05_07 T = new inflearn_05_07();
        Scanner sc = new Scanner(System.in);
        String need = sc.nextLine(), plan = sc.nextLine();
        System.out.println(T.lectureSolution(need, plan));
    }

    public String solution(String need, String plan) {
        Queue<Character> q = new LinkedList<>();
        for (char c : need.toCharArray()) q.offer(c);
        for (char c : plan.toCharArray()) {
            if (c == q.peek()) {
                q.poll();
            }
            if (q.size() == 0) return "YES";
        }
        return "NO";
    }

    public String lectureSolution(String need, String plan) {
        // 내풀이는 모든 plan과목에 대해 큐의 peek값과 비교하고 같으면 poll하고 넘어간다.
        // 여기서 plan과목에 어긋나는 경우는 for문이 끝나야 알수있다.
        // 강의 풀의는 모든 plan과목에 대해 큐에 값이 있는지 확인하고 있을 경우, 그게 제일 앞의 값인지 확인한다.
        // 이렇게 하면 어긋나는 순간을 바로 파악할 수 있다.
        String answer ="YES";
        Queue<Character> q = new LinkedList<>();
        for (char c : need.toCharArray()) q.offer(c);
        for (char c : plan.toCharArray()){
            if (q.contains(c)){
                if (c!=q.poll()) return "NO";
            }
        }
        if (!q.isEmpty()) return "NO";
        return answer;
    }
}

/*
설명
본문참고

입력
첫 줄에 한 줄에 필수과목의 순서가 주어집니다. 모든 과목은 영문 대문자입니다.
두 번 째 줄부터 현수가 짠 수업설계가 주어집니다.(수업설계의 길이는 30이하이다)

출력
첫 줄에 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력합니다.

예시 입력 1
CBA
CBDAGE

예시 출력 1
YES

예시 입력 2
CBA
CGEADB

예시 출력 1
NO

 */

