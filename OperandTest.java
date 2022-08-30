public class OperandTest {
  public static void main(String[] args){
    int number1 = 1 + 1; //足し算の子息演算(＋ ー　＊　/) 代入演算子( = ) 1というint型の整数
    System.out.println(number1);

    int number2 = (int)( 1 + 1L );// long型の1をキャストしてint型へ
    System.out.println(number2);

    long number3 = 1 + 1L;
    System.out.println(number3);

    double number4 = 1.0 + 1; //1もdouble型 1.0として判断される。
    System.out.println(number4);

    boolean number5 = true;
    System.out.println(number5);

    char number6 = 'a'; //1文字かつシングルクォーテーションで囲んだリテラル（値の時)
    System.out.println(number6);

    String number7 = "a"; //ダブルクォーテーションで囲うとその時点でString型になる
    System.out.println(number7);

    int number8 = 1;//変数作るのと同時だと、初期化される前なのでエラーになるので変数定義してから
    number8 += 1;//number8 = number8 + 1;の式を立てる
    System.out.println(number8);
    --number8;//省略されているが、上とやっていることは一緒（数値は1固定）を引く
    System.out.println(number8);//1
    number8++;
    System.out.println(number8);//2

    //実質number8 + 5がおこなわれた後に number + 1がおこなわれている  
    System.out.println(number8++ + 5);//こっちは時間差が起きてnumber8に5を足し終わった後のnumber8に++がつくので
    System.out.println(number8);//ここの状態の時に1足される状況になってしまう

    System.out.println(++number8 + 5);//これは1をnumberに足した状態で5を足すので正しいものが出る！

  }
}

// 値はリテラル
