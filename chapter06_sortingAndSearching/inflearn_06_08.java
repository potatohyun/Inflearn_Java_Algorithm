package chapter06_sortingAndSearching;

import java.util.*;

public class inflearn_06_08 {
    public static void main(String[] args) {
        inflearn_06_08 T = new inflearn_06_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int lt = 0, rt = n - 1, answer = 0;
        while (true) {
            int md = (lt + rt) / 2;
            if (m == arr[md]) {
                answer = md;
                break;
            } else if (m < arr[md]) {
                rt = md;
            }else {
                lt = md;
            }
        }
        return answer+1;
    }

    public int lectureSolution(int n, int m, int[] arr) {
        //앞에서 차례대로 보는건 순차검색. 반씩 잘라가면서 비교하는게 이분검색
        //풀이는 완벽하게 동일.
        return 0;
    }
}

/*
설명(이분검색)
임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

입력
첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.

출력
첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.

예시 입력 1
8 32
23 87 65 12 57 32 99 81

예시 출력 1
3

 */

