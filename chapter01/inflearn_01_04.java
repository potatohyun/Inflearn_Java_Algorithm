package chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inflearn_01_04 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int s = Integer.parseInt(br.readLine());

    for(int i=0; i<s; i++){
      String word = br.readLine();
      StringBuffer sb = new StringBuffer(word);
      System.out.println(sb.reverse().toString());
    }

    return;
  }
}

/*
 * 입출력 값
 * ------------------------
 * 3
 * good
 * Time
 * Big
 * 
 * ------------------------
 * doog
 * emiT
 * giB
 * ------------------------
 */
