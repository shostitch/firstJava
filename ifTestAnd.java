public class ifTestAnd {
  public static void main(String[] args) {
    int myAge = 35;         //年齢
    char myBloodType = 'O'; //血液型
    if (myAge == 35 && myBloodType == 'B') {
      System.out.println("私の年齢は３５歳で血液型はB型です！");
    } else if(myAge == 35 && myBloodType == 'A') {
      System.out.println("私の年齢は３５歳で血液型はA型です！");
    } else if(myAge >= 40) {
      System.out.println("私の年齢は４０歳以上です！");
    } else {
      System.out.println("私の年齢は３５歳でも４０歳以上でもありません！");
    }
    System.out.println("私の出身地は・・・");
  }
}
