package chapter06_sortingAndSearching;

import java.util.*;

public class inflearn_06_01 {
    public static void main(String[] args) {
        inflearn_06_01 T = new inflearn_06_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i : T.lectureSolution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public int[] lectureSolution(int n, int[] arr) {
        // '가장 작은수'와 바꿔야함. 내가한 풀이는 그냥 작으면 바꾸고 하는식으로함
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            // j로 가장 작은수 탐색
            for (int j = i + 1; j < n; j++) {
                // 작은 수를 발견하면 idx를 저장해두고 가장 장은 수를 발견하도록 끝까지 탐색
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            // 교환
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}

/*
설명 (선택정렬)
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

