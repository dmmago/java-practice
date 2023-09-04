public class StudentMain {
  public static void main(String[] args) {
    final int BASE_NO = 1000;

    Student stu1 = new Student("松田", BASE_NO+1);
    stu1.display();
    Student stu2 = new Student("村田", BASE_NO+2);
    stu2.display();
  }
  
}
