public class StudentMain {
  public static void main(String[] args) {
    Student stu1 = new Student("佐々木", 1);
    Person psn = stu1;
    psn.display();
    //psn.chgStuNo(1001);

    if(psn instanceof Student){
      //instanceof オブジェクトのクラスを特定
      Student stu2 = (Student)psn;
      stu2.chgStuNo(1001);
      stu2.display();
    }
  }
  
}
