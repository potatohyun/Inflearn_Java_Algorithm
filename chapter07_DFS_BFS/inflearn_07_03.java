package chapter07_DFS_BFS;

import java.util.Scanner;


public class inflearn_07_03 {
    public static void main(String[] args) {
        inflearn_07_03 T = new inflearn_07_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));

    }

    public int solution(int n) {
        if (n == 1) return 1;
        else return n * solution(n - 1);
    }
}

/*
설명(팩토리얼)
자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요
예를 들어 5! = 5+4+3+2+1 =120 입니다

입력
첫 줄에 총 항수  N(1<=N<=100)이 입력된다.

출력
첫 줄에 N팩토리얼 값을 출력합니다.

예시 입력 1
5

예시 출력 1
120

 */

