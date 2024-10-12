package chapter06_sortingAndSearching;

import java.util.Scanner;

public class inflearn_06_03 {
    public static void main(String[] args) {
        inflearn_06_03 T = new inflearn_06_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i : T.lectureSolution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        // 풀기 실패
//        for (int i = 1; i < n; i++) {
//            int idx = i-1;
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[i] < arr[j]) {
//                    idx = j;
//                }
//            }
//            int tmp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = tmp;
//        }
        return arr;
    }

    public int[] lectureSolution(int n, int[] arr) {
        // 삽입할 자리를 찾으면 뒤로 밀어야 함. 그걸 생각 못해서 강의 보고품
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else break;
                // 발견한 자리 그 앞부분은 이미 차례로 정렬 되있고, tmp가 들어갈 수 없는 곳이므로 beark로 단축시켜준다.
            }
            // 앞으로 넣어줬으니까 한자리씩 뒤로 밀려야함
            arr[j + 1] = tmp;
        }
        return arr;
    }
}

/*
설명 (삽입정렬)
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 선택정렬입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.

예시 입력 1
6
11 7 5 6 10 9

예시 출력 1
5 6 7 9 10 11

 */

