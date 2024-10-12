package chapter06_sortingAndSearching;

import java.util.Scanner;

public class inflearn_06_02 {
    public static void main(String[] args) {
        inflearn_06_02 T = new inflearn_06_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i : T.lectureSolution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        while (true) {
            boolean f = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    f = true;
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            if (!f) {
                break;
            }
        }
        return arr;
    }

    public int[] lectureSolution(int n, int[] arr) {
        // 인접한 두수를 비교하는게 버블정렬
        for (int i = 0; i < n - 1; i++) { // i 는 턴의 횟수
            for (int j = 0; j < n - i - 1; j++) {
                // 사실살 끝자리부터 정렬되니까, 턴 횟수를 뺀만큼만 돌면 됨
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}

/*
설명 (버블정렬)
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 선택정렬입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.

예시 입력 1
6
13 5 11 7 23 15

예시 출력 1
5 7 11 13 15 23

 */

