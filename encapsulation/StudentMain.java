class StudentMain {
  public static void main(String[] args){
    Student stu1 = new Student("菅原");
    stu1.setScore(55);
    stu1.display();

    Student stu2 = new Student("鈴木");
    stu2.setScore(-50);
    //stu2.score = -50; 　privateを設定しないとメゾット以外から直接変数に値を代入出来てしまい不正な値が入ってしまう
    stu2.display();
  }
  
}
