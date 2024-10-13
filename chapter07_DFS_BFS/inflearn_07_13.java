package chapter07_DFS_BFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inflearn_07_13 {
    static List<ArrayList<Integer>> graph;
    static int[] ch;
    static int n, m, answer=0;

    public static void main(String[] args) {
        inflearn_07_13 T = new inflearn_07_13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

    public void DFS(int v) {
        if (v==n) answer++;
        else {
            for (int nv: graph.get(v)){
                if (ch[nv]==0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
}

/*
설명(경로탐색(인접리스트))
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

