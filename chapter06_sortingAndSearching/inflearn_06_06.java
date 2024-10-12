package chapter06_sortingAndSearching;

import java.util.*;

public class inflearn_06_06 {
    public static void main(String[] args) {
        inflearn_06_06 T = new inflearn_06_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i : T.lectureSolution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        // 내가 한 풀이는 같은 수가 중복되있는부분의경우와 바겼을떄 정확한 답을 내지 못함.
        // 예를 들어 arr = [1, 7, 7, 7, 1, 8] 이런경우라면 2번과 5번이 바꼈지만 5번은 알아 내지만 2번을 알아내지는 못한다. 따라서 틀린 풀이라고 할 수 있다.
        int[] answer = new int[2];
        int idx = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                answer[0] = i + 1;
                idx = i;
                break;
            }
        }
        for (int i = idx; i < n - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                answer[1] = i + 1;
            }
        }
        return answer;
    }

    public List<Integer> lectureSolution(int n, int[] arr) {
        // 정렬한 배열과 다른지를 봄
        List<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (tmp[i] != arr[i]) answer.add(i + 1);
        }
        return answer;
    }
}

/*
설명
본문 참고

입력
첫 번째 줄에 자연수 N(5<=N<=100)이 주어진다.
두 번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어진다.
키(높이) 값 H는 (120<=H<=180)의 자연수 입니다.

출력
첫 번째 줄에 철수의 반 번호와 짝꿍의 반 번호를 차례로 출력합니다.

예시 입력 1
9
120 125 152 130 135 135 143 127 160

예시 출력 1
3 8

 */

