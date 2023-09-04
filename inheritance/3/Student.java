public class Student extends Person {
  private int stuNo;

  public Student(String name) {
    this(name, 999);  //この場合のthisはコンストラクタを指す。つまりStudent(name, 999)となり、８行目へ
  }

  public Student(String name, int stuNo) {
    super(name); //Superクラスのコンストラクタを呼び出し引数を代入。変数nameはPersonクラスで定義しているため。
    this.stuNo = stuNo;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号" + stuNo);
  }
}
  
