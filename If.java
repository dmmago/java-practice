public class If {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.1;
    int discount, amount;

    if ( price >= 3000 ) {
      discount = 300;
    } else if ( price >= 1500 ) {
      discount = 150;
    } else {
      discount = 0;
    }


    amount = (int) ((price - discount) * (1 + rate));
    System.out.println("値引価格：" + discount + "円");
    System.out.println("税込価格：" + amount + "円");

  }

    
}
