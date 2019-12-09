import java.util.Scanner;
import java.util.Random;

public class randomman {
  public static void main(String[] args) {
    
    String name; 
    System.out.println("あなたの名前を入力してください");
    Scanner scanner = new Scanner(System.in);
    name = scanner.nextLine(); 

    dousa();

    // System.out.println("今日、" + name + "さんは" + get_Flag + "をします。");
    //　ここむずい
}
  
  public static void dousa() {
  Random random = new Random();
    System.out.println("「今日あなたがすること」");
    int get_Flag = random.nextInt(3);
      
      switch (get_Flag) {
        case 0:
          System.out.println("食事");
          break;
        case 1:
          System.out.println("運動");
          break;
        case 2:
          System.out.println("睡眠");
        case 3:
          System.out.println("ゲーム");
          break;
        default:
          System.out.println("勉強");
        break;
    }
  }
}
