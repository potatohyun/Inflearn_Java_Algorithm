package chapter01;

import java.util.Scanner;

public class inflearn_01_02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String returnStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i)))
        returnStr += Character.toLowerCase(str.charAt(i));
      else
        returnStr += Character.toUpperCase(str.charAt(i));
    }
    System.out.println(returnStr);
    return;
  }
}

/*
 * 입출력 값
 * ------------------------
 * StuDY
 * ------------------------
 * sTUdy
 * ------------------------
 */
