package chapter03_twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inflearn_03_03 {
    public static void main(String[] args) {
        inflearn_03_03 T = new inflearn_03_03();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(N, K, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0, tmp = 0;
        for (int i = 0; i < n; i++) {if (i < k) {
                answer += arr[i];
                if (i==k-1){
                    tmp = answer;
                }
            }
            else {
                tmp = tmp + arr[i] - arr[i - k];
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
설명(Sliding window)
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 15 11 20 25 10 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.

입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

출력
첫 줄에 최대 매출액을 출력합니다.

예시 입력 1
10 3
12 15 11 20 25 10 20 19 13 15

예시 출력 1
56
 */

