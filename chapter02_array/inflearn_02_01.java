package chapter02_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inflearn_02_01 {
    public static void main(String[] args) {
        inflearn_02_01 T = new inflearn_02_01();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int f = arr[0];
        answer.add(arr[0]);
        for (int i : arr) {
            if (i > f) answer.add(i);
            f = i;
        }
        return answer;
    }

    public String lectureSolution(int n, int[] arr) {
        // 풀이 동일. 차이점이라면 flag를 생성하지 않고 for에서 인덱싱으로 직접 비교
        return "";
    }
}


/*
설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

예시 입력 1
6
7 3 9 5 6 12

예시 출력 1
7 9 6 12

 */

