package chapter02_array;

import java.util.Scanner;

public class inflearn_02_09 {
    public static void main(String[] args) {
        inflearn_02_09 T = new inflearn_02_09();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        // 가로
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (answer < sum) answer = sum;
        }
        // 세로
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (answer < sum) answer = sum;
        }
        // 대각선
        int q = 0;
        int w = 0;
        for (int i = 0; i < n; i++) {
            q += arr[i][i];
            w += arr[n - 1 - i][i];
        }
        if (answer < q) answer = q;
        if (answer < w) answer = w;

        return answer;
    }

    public int lectureSolution(int n, int[][] arr) {
        // 차이점 1 : 가로, 세로를 한번의 이중 for문으로 할수있다.
        // 차이점 2 : 초기 선언값을 Integer.MIN_VALUE로 최소값으로 초기화 할 수 있다.
        // 차이점 3 : Math.max 활용. if (answer < sum) answer = sum  -->  answer = Math.max(answer, sum1)

        int answer = Integer.MIN_VALUE; // 차이점 2
        int sum1, sum2;
        // 차이점 1
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            // 차이점 3
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[n - 1 - i][i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
}

/*
설명
5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
최대합을 출력합니다.

예시 입력 1
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

예시 출력 1
155

 */

