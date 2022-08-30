public class ifTest10 {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    if( ++a == 6 || --b == 10) { //左がtrueの場合に後の処理をしない＝＞　短略評価
      System.out.println("条件成立");
    } else {
      System.out.println("条件不成立");
    }
    System.out.println("a:" + a);
    System.out.println("b:" + b);
  }
}

// ++ インクリメント
// -- デクリメント
// インクリメント  デクリメント は条件文に入れるとややこしくなるので前に定義するのが基本

// --a 前置（先に-1される結果に反映される）
// a-- 後置（後から-1される結果に反映されない）
// 短略評価 => 片方が条件に達する(OR分)、または達しない場合(AND分)
// 左が条件にあった（合わない場合）右の処理がされないこと
