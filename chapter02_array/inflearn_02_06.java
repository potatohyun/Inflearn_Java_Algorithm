package chapter02_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inflearn_02_06 {
    public static void main(String[] args) {
        inflearn_02_06 T = new inflearn_02_06();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
//        System.out.println(T.lectureSolution(n));
    }

    public List<Integer> solution(int n, String[] arr) {
        // 에라토스테네츠(소수찾기) 응용 -> runtime error ->  알고 보니 조건이 n개의 자연수를 n보다 작은수라고 생각했음. 수의 최대는 100,000라고 명시되있음
        int[] primeArr = new int[100001];
        primeArr[1] = 1;
        for (int i = 2; i < 100001; i++) {
            if (primeArr[i] == 0) {
                for (int j = 2 * i; j < 100001; j = j + i) {
                    primeArr[j] = 1;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (String a : arr) {
            int tmp = Integer.parseInt(new StringBuilder(a).reverse().toString());
            if (primeArr[tmp] == 0) answer.add(tmp);
        }
        return answer;
    }

    public int lectureSolution(int n) {
        int answer = 0;
        //여기서는 isPrime이라는 메서드를 만들어서 하나씩 여기로 넘김.
        // 이 메서드는 그 넘겨진 숫자보다 작은 모든수로 %해보고 소수인지 아닌지를 판별해서 결과를 returng하는 방식.
        return answer;
    }
}


/*
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1
9
32 55 62 20 250 370 200 30 100

예시 출력 1
23 2 73 2 3
 */

