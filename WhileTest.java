public class WhileTest {
  public static void main(String[] args) {
    System.out.println("番号！");
    int number = 1; //番号が1から始まる
    while(number <= 10) {  // while・・・(条件)の間 trueの間処理を繰り返すfalseになった時点でスキップされる
      System.out.println(number + "!");
      number++;
    }
  }
}
