public class ArrayTest2 {
  public static void main(String[] args) {
    String name = "鈴木太郎";
    String email = "suzuki_taro@xxxx.com";
    String phone = "090-0000-9999";
    System.out.println(name);
    System.out.println(email);
    System.out.println(phone);

    System.out.println();

    String[] customer; // String型の配列を宣言
    // customer[0] = "鈴木太郎"; //配列の初期化ができていない！
    customer = new String[3];
    int a = 3;

    switch(a){
      case 1:
        customer[0] = "鈴木太郎";// 0のことを添字、indexという！その値が入る箱を要素という！
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999";
      case 2:
        customer[0] = "鈴木太郎";// 0のことを添字、indexという！その値が入る箱を要素という！
        customer[1] = "suzuki_taro@xxxx.com";
      case 3:
        customer[0] = "鈴木太郎";// 0のことを添字、indexという！その値が入る箱を要素という！
    }
    for(int i = 0; i < customer.length; i ++){
      if(customer[i] != null){
        System.out.println(customer[i]);
      }
      
    }

    System.out.println();

    //String[] customer2;
    //customer2 = {"鈴木太郎","suzuki_taro@xxxx.com","090-0000-9999"};
    //{}で初期化する場合、宣言と初期化を分けられない

    String[] customer2 = {"鈴木太郎","suzuki_taro@xxxx.com","090-0000-9999"};
//  new 型名[]で初期化する場合、宣言と初期化を同時に行う
    System.out.println(customer2[0]);
    System.out.println(customer2[1]);
    System.out.println(customer2[2]);

    System.out.println();

    String[] customer3 = {"鈴木太郎","suzuki_taro@xxxx.com","090-0000-9999"};
    for(int i = 0; i < customer.length; i ++){
      System.out.println(customer3[i]);
    }

    System.out.println();

    //拡張for文 1ずつ増やす時のみ利用可能
    //かなり便利そう！
    //特定のループ回数時に行う処理もできない！
    //最初から最後まで強制的に出力されるから途中飛ばすこととかもできない！

    String[] customer4 = {"鈴木太郎","suzuki_taro@xxxx.com","090-0000-9999"};
    for(String info : customer4){
      System.out.println(info);
    }

  }
}
