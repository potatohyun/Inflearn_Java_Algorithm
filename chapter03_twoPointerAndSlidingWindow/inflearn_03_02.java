package chapter03_twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class inflearn_03_02 {
    public static void main(String[] args) {
        inflearn_03_02 T = new inflearn_03_02();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n_arr = new int[N];
        for (int i = 0; i < N; i++) {
            n_arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] m_arr = new int[M];
        for (int i = 0; i < M; i++) {
            m_arr[i] = sc.nextInt();
        }
        for (int i : T.solution(N, M, n_arr, m_arr)) {
            System.out.print(i + " ");
        }
    }

    public List<Integer> solution(int n, int m, int[] n_arr, int[] m_arr) {
        Arrays.sort(n_arr);
        Arrays.sort(m_arr);
        List<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1<n && p2<m){
            if(n_arr[p1]==m_arr[p2]) {
                answer.add(n_arr[p1++]);
                p2++;
            }else if(n_arr[p1]>m_arr[p2]) {
                p2++;
            }else p1++;
        }
        return answer;
    }

    public List<Integer> lectureSolution(int n, int m, int[] n_arr, int[] m_arr) {
        // 풀이 동일
        List<Integer> answer = new ArrayList<>();
        return answer;
    }
}

/*
설명(two pointers algorithm)
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.

출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

예시 입력 1
5
1 3 9 5 2
5
3 2 5 7 8

예시 출력 1
2 3 5
 */

