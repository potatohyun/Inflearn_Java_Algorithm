package chapter01;
import java.util.Scanner;

public class inflearn_01_01 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    char chr = in.next().charAt(0);
    int cnt = 0;

    for (int i = 0; i < str.length(); i++) {
        if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(chr)) {
            cnt++;
        }
    }
    System.out.println(cnt);

    return ;
  }
}

/* 입출력 값
------------------------
Computercooler
c
------------------------
2
------------------------
 */

