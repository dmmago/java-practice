class StudentMain {
  public static void main(String[] args) {
    
    Student stu1 = new Student("鈴木");
    Student stu2 = new Student("加藤", 49, 80);


    stu1.setScore(30, 49);
    stu1.display();
    stu2.display();
  }
}
