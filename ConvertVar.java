public class ConvertVar {
  public static void main(String[] args) {
    int number1 = 100;  // 箱の大きさ約21億
    long number2 = 200; // 箱の大きさ約900京
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);

    number2 = number1;// longの変数にintの値を代入(long > int)longのが箱が大きいので小さいint型の情報を入れることができる
    System.out.println("long number2 <= number1");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);

    number1 = 100;
    number2 = 200;
    number1 = (int)number2; // 21億に収まる数値ならこの方法を使っても問題ないが越えると削られてしまうのであまり推奨されない
    // 無理やり型を変更　= キャストという！！！
    System.out.println("int number1 <= long number2");
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);

    double number3 = 10.5;
    number3 = number2;
    System.out.println("double number3 <= long number2");
    System.out.println("number2:" + number2);
    System.out.println("number3:" + number3);

    number3 = 10.5;
    number2 = (long)number3; // longの変数にdouble型の値を削って(キャスト)代入
    System.out.println("long number2 <= double number3");
    System.out.println("number2:" + number2);
    System.out.println("number3:" + number3);
  }
}
