package training;

public class Main6 {
  public static void main(String[] args) throws Exception {
      System.out.println("引数は" + args.length + "個指定されています。");
      for(int idx = 0 ; idx < args.length; idx ++){
          System.out.println((idx + 1 ) + "番目の引数は「" + args[idx] + "」です。");
      }
  }
}
  

