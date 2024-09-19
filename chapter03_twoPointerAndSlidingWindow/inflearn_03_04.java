package chapter03_twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inflearn_03_04 {
    public static void main(String[] args) {
        inflearn_03_04 T = new inflearn_03_04();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(N, M, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0, tmp = 0;
        for (int i = 0; i < n; i++) {if (i < m) {
                answer += arr[i];
                if (i==m-1){
                    tmp = answer;
                }
            }
            else {
                tmp = tmp + arr[i] - arr[i - m];
                answer = Math.max(tmp, answer);
            }
        }
        return answer;
    }

    public List<Integer> lectureSolution(int n, int m, int[] n_arrr) {
        // 흐름은 동일. 풀이에서는 기본값에 대한 for문을 따로 먼저 돌림.
        List<Integer> answer = new ArrayList<>();
        return answer;
    }
}

/*
설명(복합문제)
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
수열의 원소값은 1,000을 넘지 않는 자연수이다.

출력
첫째 줄에 경우의 수를 출력한다.

예시 입력 1
8 6
1 2 1 3 1 1 1 2

예시 출력 1
3
 */

