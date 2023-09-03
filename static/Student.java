class Student {
  String name;
  static int counter = 0;

  Student(String n) {
    name = n;
    counter++;
    System.out.println(name + "さんをインスタンス化");
  }
  static void display() {
    System.out.println(counter + "人です");
  }
  
}
