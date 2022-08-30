public class Variable {
  public static void main(String[] args) {
    int myAge; // 情報の入る箱！（変数）を定義！
    myAge = 22; //初期化
    myAge = 44; //上書き
    //myAge = "ABC"; //int型は整数なので文字列は代入できない
    // 一度型を決めたら変更できない（静的型付け言語）　// PHPなど入れ直せる言語は（動的型付け言語）
    System.out.println(myAge);
  }
}
