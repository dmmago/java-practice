public class Student{
  private String name;     
  private Club club;       //クラブオブジェクト

  public Student(String name, Club club){
    this.name = name;
    this.club = club;
  }
  public void display(){
    System.out.println("名前:" + name);
    club.display();
  }
  public void practice(){
    club.practice();
  }
}
