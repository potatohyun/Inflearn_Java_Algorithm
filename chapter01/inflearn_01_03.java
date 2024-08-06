package chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn_01_03 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    br.close();
    String longString = "";

    String[] arr = s.split(" ");
    for (String a : arr) {
      if (longString.length() < a.length()) {
        longString = a;
      }
    }

    System.out.println(longString);
    return;
  }
}

/*
 * 입출력 값
 * ------------------------
 * it is time to study
 * ------------------------
 * study
 * ------------------------
 */
