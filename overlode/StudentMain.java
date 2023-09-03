class StudentMain {
  public static void main(String[] args) {
    Student stu1 = new Student();
    Student stu2 = new Student();

    stu1.setDate("佐々木");
    stu1.setScore(59, 65);
    stu1.display();

    stu2.setDate("鈴木", 40, 80);
    stu2.display();

  }
    
}
