package chapter05_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class inflearn_05_03 {
    public static void main(String[] args) {
        inflearn_05_03 T = new inflearn_05_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int[] t_arr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                board[i][j] = tmp;
                if (tmp != 0 && t_arr[j] == 0) t_arr[j] = i;
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, board, t_arr, moves));
    }

    public int solution(int n, int[][] board, int[] tArr, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int m : moves) {
            if (tArr[m-1]< n) {
                int tmp = board[tArr[m-1]][m-1];
                if (st.isEmpty() || st.peek()!=tmp) st.push(tmp);
                else {
                    st.pop();
                    answer++;
                }
                tArr[m-1]++;
            }
        }
        return answer*2;
    }

    public int lectureSolution(int n, int[][] board, int[] tArr, int[] moves) {
        int answer = 0;
        return answer;
    }
}

/*
설명
본문 참고

예시 입력 1
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4

예시 출력 1
4
 */

