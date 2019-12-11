/*2019/12/02*/
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("あなたの名前を入力してください");
        name = scanner.nextLine();
      
        System.out.println("あなたの年齢を入力してください");
            while(true) {
                int yourAge = scanner.nextInt();
                yourAge++;
                
                System.out.println("2020年の" + name + "さんは" + yourAge + "歳ですね。");
                break;
            }
        }
}
