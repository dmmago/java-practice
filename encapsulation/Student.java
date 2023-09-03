public class Student {
  private String name;
  private int score;

  public Student(String n){
    name = n;
  }

  public void setScore(int s){
    if(0 <= s && s <= 100) {
      score = s;
    } else {
      System.out.println(name + "さんの点数が適用外です");
      score = 0;
    }
  }

  void display(){
    System.out.println(name + "さん:" + score + "点");
  }
  
}
