package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
    public static void main( String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String  s = br.readLine();    // 1行分の文字列を入力する
        int x = Integer.parseInt(s);
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
  }
}
