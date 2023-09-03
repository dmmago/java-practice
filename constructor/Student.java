class Student {
  String name;
  int engScore;
  int mathScore;

  Student(String n) {
    name = n;
  }

  Student(String n, int e, int m) {
    name = n;
    engScore = e;
    mathScore = m;
  }

  void setScore(int e, int m) {
    engScore = e;
    mathScore = m;
  }

  void display() {
    System.out.println(name + "さん");
    System.out.println("数学" + mathScore + "英語" + engScore);
  }    
}
