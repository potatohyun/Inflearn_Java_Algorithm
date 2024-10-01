package chapter05_stackAndQueue;

import java.util.*;

public class inflearn_05_06 {
    public static void main(String[] args) {
        inflearn_05_06 T = new inflearn_05_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(T.lectureSolution(n, k));
    }

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) queue.offer(i);
        int cnt = 0;
        while (queue.size() > 1) {
            if (cnt == k - 1) {
                queue.poll();
                cnt = 0;
            } else {
                queue.offer(queue.poll());
                cnt++;
            }
        }
        answer = queue.poll() + 1;
        return answer;
    }

    public int lectureSolution(int n, int k) {
        //구분  Time	  Memory
        //sol  181ms  28MB
        //lec  163ms  27MB
        //으로 사실상 비슷.
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) q.offer(q.poll());
            q.poll();
            if (q.size() == 1) answer = q.poll();
        }
        return answer;
    }
}

/*
설명
본문참고

입력
첫 줄에 자연수 N(5<=N<=1,000)과 K(2<=K<=9)가 주어진다.

출력
첫 줄에 마지막 남은 왕자의 번호를 출력합니다.

예시 입력 1
8 3

예시 출력 1
7

 */

