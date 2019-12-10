import java.util.Scanner;

public class LongShortCat {
  public static void main(String[] args) {

    int longCatBody;
    System.out.println("長い猫を作ろう");
    Scanner scanner = new Scanner(System.in);
    longCatBody = scanner.nextInt();
    
    System.out.println("  ^---------^ ");
    System.out.println("(  0       0  )");
    System.out.println("( =    ▽    = )");
    System.out.println("(     ＾ 　   )");
    System.out.println("　----------- ");
    System.out.println(" m          m ");
 
    for (int catBody = 0; catBody < longCatBody; catBody++) {
       System.out.println(" |          | ");
      }

    System.out.println(" |          | ");
    System.out.println(" | ｜---｜  | ");
    System.out.println(" | ｜ 　｜  | ");
    System.out.println(" | ｜ 　｜  | ");
    System.out.println(" | ｜ 　｜  | ");
    System.out.println("  -- 　  --  ");
    
      if(longCatBody <= 10) {
        System.out.println("これは・・・長い猫ではありません・・・");
      } else if (longCatBody >= 11 && longCatBody < 49) {
        System.out.println("長い猫です！");
      } else if (longCatBody >= 50 && longCatBody < 79) {
        System.out.println("すごく長い猫です！!!");
      } else if (longCatBody >= 80) {
        System.out.println("もはや猫ではありません!!!!!");
      } else {

      }
    }
  }