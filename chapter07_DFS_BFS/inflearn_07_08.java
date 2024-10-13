package chapter07_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class inflearn_07_08 {
    public static void main(String[] args) {
        inflearn_07_08 T = new inflearn_07_08();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), e = sc.nextInt();
        System.out.println(T.solution2(s, e));
    }

    public int BFS(int s, int e) {
        int[] dis = {1, -1, 5};
        int[] visited;
        Queue<Integer> q = new LinkedList<>();

        visited = new int[10001]; // 입력 조건
        visited[s] = 1; //출발지점
        q.offer(s);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                if (x == e) return l;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    //nx가 범위안에 들고 아직 방문하지 않았으면(0이면 방문하지 않은것)
                    if (nx >= 1 && nx <= 10000 && visited[nx] == 0) {
                        visited[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            l++;
        }
        return 0;
    }

    //다시한번 풀어본거.
    public int solution2(int s, int e) {
        int[] dis = {-1, 1, 5};
        int[] visited = new int[100001];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = 1;
        q.offer(s);
        int dep = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int tmp = q.poll();
                if (tmp == e) return dep;
                for (int d : dis) {
                    int n_tmp = tmp + d;
                    if (n_tmp >= 1 && n_tmp <= 10000 && visited[n_tmp] == 0) {
                        visited[n_tmp] = 1;
                        q.offer(n_tmp);
                    }
                }
            }
            dep++;
        }

        return 0;
    }

    // 수학으로도 풀수있는 문제
    public int solution1(int s, int e) {
        int dis = 0, answer = 0;
        if (s < e) {
            dis = (e - s);
            answer = dis / 5;
            int lft = dis % 5;
            if (lft == 0) return answer;
            if (lft == 3) return answer + 3;
            if (lft == 2 || lft == 4) return answer + 2;
            else return answer + 1;
        } else {
            dis = s - e;
            return dis;
        }
    }
}

/*
설명(송아지 찾기 (BFS : 상태트리탐색))
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

입력
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

출력
점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.

예시 입력 1
5 14

예시 출력 1
3
 */

