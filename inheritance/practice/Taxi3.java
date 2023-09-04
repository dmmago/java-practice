class Taxi3 extends Car3{
  Taxi3(){
    this(9999);
    System.out.println("Taxi()");
  }
  Taxi3(int no){
    super(no);
    System.out.println("Taxi(int no)");
  }
  Taxi3(String no){
    System.out.println("Taxi(String no)");
  }
}
