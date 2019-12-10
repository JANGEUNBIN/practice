/*2019/12/02*/
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("あなたの年齢を入力してください");
            while(true) {
                int yourAge = scanner.nextInt();
                yourAge++;
                
                System.out.println("2020年のあなたは" + yourAge + "歳です。");
                break;
            }
        }
}