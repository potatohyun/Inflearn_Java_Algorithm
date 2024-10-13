package chapter07_DFS_BFS;

import java.util.Scanner;


public class inflearn_07_04 {
    public static void main(String[] args) {
        inflearn_07_04 T = new inflearn_07_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        T.solution(n);
        for (int x : arr) System.out.print(x + " ");
    }

    static int[] arr;

    public int solution(int n) {
        if (n == 0) return arr[0] = 0;
        if (n == 1) return arr[1] = 1;
        else return arr[n]=solution(n-2)+solution(n-1);
    }
}

/*
설명(피보나치 수열)
1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

입력
첫 줄에 총 항수  N(3<=N<=45)이 입력된다.

출력
첫 줄에 피보나치 수열을 출력합니다.

예시 입력 1
10

예시 출력 1
1 1 2 3 5 8 13 21 34 55

 */

