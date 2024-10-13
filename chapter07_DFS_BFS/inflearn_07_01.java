package chapter07_DFS_BFS;

import java.util.Scanner;


public class inflearn_07_01 {
    public static void main(String[] args) {
        inflearn_07_01 T = new inflearn_07_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }

    public void solution(int n) {
        int num = 1;
        fun(num, n);
    }

    public void fun(int num, int n) {
        System.out.print(num);
        if (num < n) {
            System.out.print(" ");
            num++;
            fun(num, n);
        }
    }

    public void lectureSolution(int n) {
        fun2(n);
    }

    public void fun2(int n) {
        if (n == 0) return;
        else {
            fun2(n - 1);
            System.out.print(n + " ");
        }
    }


}
/*
설명(재귀함수)
자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요

입력
첫 줄에 정수 N(3<=N<=10)이 입력됩니다.

출력
첫 줄에 출력하세요.

예시 입력 1
3

예시 출력 1
1 2 3

 */

