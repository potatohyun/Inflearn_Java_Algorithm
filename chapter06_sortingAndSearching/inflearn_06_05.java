package chapter06_sortingAndSearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class inflearn_06_05 {
    public static void main(String[] args) {
        inflearn_06_05 T = new inflearn_06_05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Integer[] arr = new Integer[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//        System.out.print(T.solution(n, arr));
        System.out.print(T.lectureSolution(n, arr));
    }

    public String solution(int n, Integer[] arr) {
        // set을 이용해 기존의 배열 길이와 다르면 중복값이 있다는 의미니까 set으로 중복값 확인.
        // 확인해봤을때 선언과 동시에 변환하는거보다 for로 하나씩 set해주는게 시간이 좀 덜 거리는거같음
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        if (set.size()!=n) return "D";
        else return "U";
    }

    public String lectureSolution(int n, int[] arr) {
        // 정렬하고 인접한 두수가 중복되는지 확인. 이방법이 memory는 비슷한데 시간 측면에서 절약됨.
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) return "D";
        }
        return "U";
    }
}

/*
설명(중복 확인)
현수네 반에는 N명의 학생들이 있습니다.
선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.

출력
첫 번째 줄에 D 또는 U를 출력한다.

예시 입력 1
8
20 25 52 30 39 33 43 33

예시 출력 1
D

 */

