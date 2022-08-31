public class ArrayTest {
  public static void main(String[] args) {
    String name = "鈴木太郎";
    String email = "suzuki_taro@xxxx.ccom";
    String phone = "090-0000-9999";
    System.out.println(name);
    System.out.println(email);
    System.out.println(phone);

    System.out.println();

    String[] customer; //String型の配列を宣言
    //customer[0] = "鈴木太郎"; //配列の初期化ができていない！
    customer = new String[3];
    customer[0] = "鈴木太郎";//0のことを添字、indexという！その値が入る箱を要素という！
    customer[1] = "suzuki_taro@xxxx.ccom";
    customer[2] = "090-0000-9999";

    System.out.println(customer[0]);
    System.out.println(customer[1]);
    System.out.println(customer[2]);
  }
}
