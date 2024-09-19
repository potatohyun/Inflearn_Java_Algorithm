package chapter03_twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inflearn_03_01 {
    public static void main(String[] args) {
        inflearn_03_01 T = new inflearn_03_01();
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
        List<Integer> answer = new ArrayList<>();
        int nf = 0, mf = 0;
        for (int i = 0; i < m + n; i++) {
            if (nf < n && n_arr[nf] < m_arr[mf]) {
                answer.add(n_arr[nf]);
                nf++;
            } else {
                answer.add(m_arr[mf]);
                mf++;
            }
        }
        return answer;
    }

    public List<Integer> lectureSolution(int n, int m, int[] n_arr, int[] m_arr) {
        //while로 비교할수있는곳까지만 비교하고 나머지는 싹다 넣으주는 방식.
        // 내가 한거는 runtimeError로 실패하는데. 계속 비교하고 넣는 방식이라서 그런듯
        // chatGPT : 인덱스 초과
        // solution 메서드에서는 for 루프가 i < m + n로 설정되어 있습니다. 이는 n_arr와 m_arr의 크기보다 더 많은 반복을 하게 되어, nf 또는 mf가 배열의 경계를 초과할 수 있습니다.
        // 반면, lectureSolution 메서드는 while 루프를 사용하여 각 배열의 끝에 도달할 때까지 반복하므로, 인덱스 초과 문제를 피합니다.
        // 라고 했다.
        List<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1<n && p2<m){
            if(n_arr[p1]<m_arr[p2]) answer.add(n_arr[p1++]);
            else answer.add(m_arr[p2++]);
        }
        while (p1<n)answer.add(n_arr[p1++]);
        while (p2<m)answer.add(m_arr[p2++]);
        return answer;
    }
}

/*
설명(two pointers algorithm)
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
오름차순으로 정렬된 배열을 출력합니다.

예시 입력 1
3
1 3 5
5
2 3 6 7 9

예시 출력 1
1 2 3 3 5 6 7 9
 */

