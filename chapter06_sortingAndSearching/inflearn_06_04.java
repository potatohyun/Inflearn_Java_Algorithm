package chapter06_sortingAndSearching;

import java.util.Scanner;

public class inflearn_06_04 {
    public static void main(String[] args) {
        inflearn_06_04 T = new inflearn_06_04();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i : T.lectureSolution(s, n, arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int s, int n, int[] arr) {
        int[] memory = new int[s];
        for (int a : arr) {
            // 새로 삽입되는 숫자가 a. memory를 순회하면서 하나씩 미룸.
            // a와 같은 숫자면 더이상 미루지 않는다. 즉 memory에 a와 같은게 없으면 끝까지 미루는게 진행됨.
            int pre = a;
            for (int i = 0; i < s; i++) {
                if (memory[i] != a) {
                    int tmp = memory[i];
                    memory[i] = pre;
                    pre = tmp;
                } else {
                    memory[i] = pre;
                    break;
                }
            }
        }
        return memory;
    }

    public int[] lectureSolution(int s, int n, int[] arr) {
        // 삽입정렬.. 까진 아닌데 그런 스타일로 풀려고 했는듯.
        // array list의 set메서드를 이용하면 그위치에 삽입하고 뒤에는 한자리씩 밀리는 그런 기능이 있긴함.
        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            // 기존에 구성된 캐시메모리를 돌면서 새로 삽입할 값과 동일한 값이 있는지 우선 탐색.
            for (int i = 0; i < s; i++) if (x == cache[i]) pos = i;
            // 같은게 없다면 배열 끝까지 한자리씩 미룸.(뒤에서부터 진행)
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            // 있다면 그위치까지 밀리게 함.(같은 위치부터 처음위치까지 거꾸로 진행)
            else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            //그다음 새로운 값에 대해 삽입진행.
            cache[0] = x;
        }
        return cache;
    }
}

/*
설명(Least Recently Used)
본문 참고

입력
첫 번째 줄에 캐시의 크기인 S(3<=S<=10)와 작업의 개수 N(5<=N<=1,000)이 입력된다.
두 번째 줄에 N개의 작업번호가 처리순으로 주어진다. 작업번호는 1 ~100 이다.

출력
마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력합니다.

예시 입력 1
5 9
1 2 3 2 6 2 3 5 7

예시 출력 1
7 5 3 2 6

 */

