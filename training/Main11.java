package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
    public static void main( String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        System.out.println("あなたの年齢");
        int age = Integer.parseInt(br.readLine());
        System.out.println("生まれてから" + age * 365 + "です");
  }
}
