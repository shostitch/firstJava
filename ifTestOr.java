public class ifTestOr {
  public static void main(String[] args) {
    int myAge = 0;         //年齢
    String myBloodType = "不明"; //血液型
    if (myAge == 35 || myBloodType .equals("B")) { // 年齢または血液型が正しければ実行
      System.out.println("私の年齢は３５歳または血液型はB型です！");
    } else if(myAge == 35 || myBloodType .equals("A")) {
      System.out.println("私の年齢は３５歳または血液型はA型です！");
    } else if(myAge == 40 || myBloodType .equals("O")) {
      System.out.println("私の年齢は４０歳以上または血液型はO型です！");
    } else if(myAge == 50 || myBloodType .equals("AB")) {
      System.out.println("私の年齢は50歳以上または血液型はAB型です！");
    } else {
      System.out.println("私の年齢と血液型は、あなたの考えていることとは違います！");
    }
    System.out.println("私の出身地は・・・");
  }
}
