public class Switch {
	public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    switch(num) {
      case 1:
        System.out.println("料金3000円");
        break;
      case 2:
        System.out.println("料金2000円");
        break;
      case 3:
        System.out.println("料金1000円");
        break;
      default:
        System.out.println("1:一般, 2:学生, 3:12歳未満");
    }
  }
}
    

