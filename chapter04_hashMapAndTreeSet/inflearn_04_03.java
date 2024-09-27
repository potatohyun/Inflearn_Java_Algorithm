package chapter04_hashMapAndTreeSet;

import java.util.*;

public class inflearn_04_03 {
    public static void main(String[] args) {
        inflearn_04_03 T = new inflearn_04_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i:T.solution(n,k,arr)) System.out.print(i + " ");
    }

    public List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i<k-1) map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            else if (i==k-1) {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
                answer.add(map.size());
            } else {
                int tmp = arr[i-k];
                if (map.get(tmp)==1) map.remove(tmp);
                else map.put(tmp,map.get(tmp)-1);
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
                answer.add(map.size());
            }
        }
        return answer;
    }

    public List<Integer> lectureSolution(int n, int k, int[] arr) {
        // 풀이 거의 동일. 풀이에서는 기본값은 따로 for문 돌림
        List<Integer> answer = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if (map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
}

/*
설명(HashMap, Sliding Window)
현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.
만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
20 12 20 10 23 17 10
각 연속 4일간의 구간의 매출종류는
첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별매출액의 종류를 출력하는 프로그램을 작성하세요.

입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

출력
첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.

예시 입력 1
7 4
20 12 20 10 23 17 10

예시 출력 1
3 4 4 3
 */

