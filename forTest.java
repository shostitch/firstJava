public class forTest {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++){
      //int n = i + 1;
      if(i % 5 == 0){
        //break; // 強制終了
        continue;
      }
      System.out.println("今" + i + "周目です");
      
    }
  }
  }
