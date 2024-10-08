package chapter04_hashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class inflearn_04_02 {
    public static void main(String[] args) {
        inflearn_04_02 T = new inflearn_04_02();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(T.solution(str1, str2));
    }

    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c: str2.toCharArray()){
            if (!map.containsKey(c)) return "NO";
            if (map.get(c) == 1) map.remove(c);
            else map.put(c,map.get(c)-1);
        }
        return answer;
    }

    public char lectureSolution(int n, String str) {
        // 풀이 동일
        return ' ';
    }
}

/*
설명(HashMap)
Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.

입력
첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
단어의 길이는 100을 넘지 않습니다.

출력
두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.

예시 입력 1
AbaAeCe
baeeACA

예시 출력 1
YES

예시 입력 2
abaCC
Caaab

예시 출력 2
NO
 */

