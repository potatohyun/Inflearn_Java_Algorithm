package chapter01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class inflearn_01_05 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        ArrayList<Character> rvs_chars = new ArrayList<>();

        // 알파벳 추출 및 표시해두기
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                rvs_chars.add(chars[i]);
                chars[i] = '0';
            }
        }

        //알파벳 뒤집기
        Collections.reverse(rvs_chars);

        for (char c : chars) {
            if (c == '0') {
                System.out.print(rvs_chars.get(0));
                rvs_chars.remove(0);
            } else
                System.out.print(c);
        }
        return;
    }
}

/*설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


예시 입력 1
a#b!GE*T@S

예시 출력 1
S#T!EG*b@a

 */
