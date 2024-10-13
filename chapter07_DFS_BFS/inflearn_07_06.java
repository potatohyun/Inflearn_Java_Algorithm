package chapter07_DFS_BFS;

public class inflearn_07_06 {
    public static void main(String[] args) {
        inflearn_07_06 T = new inflearn_07_06();
        n = 3;
        arr = new int[n + 1];
        T.DFS(1);
    }

    static int n;
    static int[] arr;

    public void DFS(int l) {
        if (l == n + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) sb.append(i + " ");
            }
            if (sb.length() > 0) System.out.println(sb);
        } else {
            arr[l] = 1; // 1 : 사용한다.
            DFS(l + 1);
            arr[l] = 0; // 사용하지 않는다
            DFS(l + 1);
        }
    }
}

/*
설명(부분집합 구하기(DFS))
자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요

입력
첫 줄에 총 항수  N(1<=N<=10)이 입력된다.

출력
첫 번째 줄부터각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다
단 공집합은 출력하지 않는다.

예시 입력 1
3

예시 출력 1
1 2 3
1 2
1 3
1
2 3
2
3


 */

