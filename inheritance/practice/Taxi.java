public class Taxi extends Car{
  private int price;
  
  public void start(){
    price = 420;
  }
  
  public void run(){
    price += 80; 
  }

  public void display(){
    System.out.println("料金は" + price);
  }
}
