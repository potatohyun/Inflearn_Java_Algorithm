package chapter07_DFS_BFS;

import java.util.Scanner;


public class inflearn_07_02 {
    public static void main(String[] args) {
        inflearn_07_02 T = new inflearn_07_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }

    public void solution(int n) {
        // 풀이동일
        if (n == 0) {
            return;
        } else {
            solution(n / 2);
            System.out.print(n % 2);
        }
    }
}
/*
설명(재귀)
10진수 N이 입력되 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단, 재귀함수를 이용해서 출력해야합니다.

입력
첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.

출력
첫 줄에 이진수를 출력하세요.

예시 입력 1
11

예시 출력 1
1011

 */

