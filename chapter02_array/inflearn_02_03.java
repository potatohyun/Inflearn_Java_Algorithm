package chapter02_array;

import java.util.Scanner;

public class inflearn_02_03 {
    public static void main(String[] args) {
        inflearn_02_03 T = new inflearn_02_03();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arrA = new int[n], arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }
        for (char i : T.solution(n, arrA, arrB)) {
            System.out.println(i);
        }
    }

    public char[] solution(int n, int[] arrA, int[] arrB) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) answer[i] = 'D';
            else if (arrA[i] == 1 && arrB[i]==2 || arrA[i] == 2 && arrB[i]==3 || arrA[i] == 3 && arrB[i] == 1) answer[i] = 'B';
            else answer[i] = 'A';
        }
        return answer;
    }

    public String lectureSolution(int n, int[] arr) {
        // 풀이 동일.
        return "";
    }
}


/*
설명

A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.

예시 입력 1
5
2 3 3 1 3
1 1 2 2 3

예시 출력 1
A
B
A
B
D

 */

