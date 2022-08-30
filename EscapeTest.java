public class EscapeTest {
  public static void main(String[] args){
    System.out.println("Hello");
    System.out.println("Double quote(\") is displayed");// バックスラッシュでエスケープする（逃す）\" ダブルクォーテーションが表示される　
    //文字を閉じる役割をなくす（ただの文字列になる）
    char c = '\'';
    System.out.println(c);

    char a = '\\';
    System.out.println(a);
    System.out.println("Hello!\n World!"); // 改行の制御文字\n
    System.out.println("Hello!\t World"); // 改行の制御文字\t

    String str = null;
    boolean test = true;
    if (test == true) {
      str = "Hello!\n World!";
    } else {
      str = "Hello! World!";
    }
    System.out.println(str);

  }
}
