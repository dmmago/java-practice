package training;
import java.io.*;

public class Main12 {
  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
  int x = Integer.parseInt(br.readLine());
  int y = Integer.parseInt(br.readLine());
  
  if(x > y)
  System.out.println("xはyより大きい");
  } 
  
}
