import java.util.Scanner;
import java.util.Random;

public class randomman {
  public static void main(String[] args) {
    String name;

    System.out.println("あなたの名前を入力してください");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine(); 

    String Ugoki = dousa();

    System.out.println("今日、" + name + "さんは" + Ugoki + "をします。");
}
  

  public static String dousa() {
    String Ugoki = new String();

    Random random = new Random();
      System.out.println("「今日あなたがすること」");
      int get_Flag = random.nextInt(3);

        switch (get_Flag) {
          case 0:
            Ugoki = "食事";
            break;
          case 1:
            Ugoki = "運動";
            break;
          case 2:
            Ugoki = "睡眠補充";
            break;
          case 3:
            Ugoki = "ゲーム";
            break;
          default:
            Ugoki = "勉強";
          break;
        }
      return Ugoki;
  }
}
