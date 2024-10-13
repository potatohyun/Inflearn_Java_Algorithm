package chapter07_DFS_BFS;

import java.util.Scanner;

public class inflearn_07_12_re {
    int[][] arr;
    int[] visited;
    int answer = 0;
    static int n, m;

    public static void main(String[] args) {
        inflearn_07_12_re T = new inflearn_07_12_re();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        T.arr = new int[n + 1][n + 1];
        T.visited = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            T.arr[a][b] = 1;
        }
        T.visited[1] = 1;
        System.out.println(T.DFS(1));
    }

    public int DFS(int v) {
        if (n == v) return answer++;
        for (int i = 1; i < n + 1; i++) {
            if (arr[v][i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                DFS(i);
                visited[i] = 0;
            }
        }
        return answer;
    }
}

/*
설명(경로탐색 DFS)
[강의 사진 참고]
방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
예를 들어 1번 정점에서 5번 정점으로 가는 가지수는
1 2 3 4 5
1 2 5
1 3 4 2 5
1 3 4 5
1 4 2 5
1 4 5
총 6가지이다

입력
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

출력
총 가지수를 출력한다.

예시 입력 1
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

예시 출력 1
6

 */

