public class doWhileTest {
  public static void main(String[] args){
    System.out.println("番号を大きい順に！");
    int number = 11;
    do {
      System.out.println(number + "!!");
      number--;
    } while(number <= 10 && number >= 1);
  }
}
