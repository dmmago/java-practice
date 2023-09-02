public class Loop {
  public static void main(String[] args) {
    int i = 0;
    while ( i < 3) {
      System.out.println("i=" + i);
      i++;
    }

    for(int n = 0; n < 3 ; n++){
      System.out.println("n=" + n);
    }

    int [] score = new int[3];
    score[0] = 80;
    score[1] = 90;
    score[2] = 100;

    String [] name = {"佐々木", "鈴木", "田中"};
    for (int x = 0; x < score.length; x++) {
      System.out.println(name[x] + "は" + score[x] + "点");
    }

   
  }

    
}
