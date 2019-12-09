/*2019/12/03*/
import java.util.Scanner;

public class Wednesday {
    public static void main(String[] args) {
        System.out.println("「すばらしきすいようびのうた」");
        System.out.println("→　1. うたをうたおう");
        System.out.println("→　2. うたわない");
        Scanner scanner = new Scanner(System.in);
        
        int song = scanner.nextInt();
        song--;

        switch (song) {
            case 0:
                wedSong();
                break;
        
            default:
                System.out.println("そとはまだかようびだった");
                break;
            }
        }

        public static void wedSong() {
            System.out.println("月火水木金土日\n月火水木金土日\n");
            System.out.println("今日も朝から水曜日\n今日も朝から水曜日\n朝起きたら水曜日\n今日は素敵な水曜日\nバイト休みだ水曜日\n");
            System.out.println("月火水木金土日\n月火水木金土日\n");
            System.out.println("水曜日の神様が\n他の曜日の神様を\n殺してしまえと言ったから\n今日も朝から水曜日\n");
            System.out.println("ふんふふ水ふふふんふんふん\nふんふふ水ふふふんふんふん\n");
            System.out.println("今日も明日も水曜日\nバイト休みだ水曜日\n燃えるゴミの日水曜日\nレディースデイだ水曜日\n");
            System.out.println("ふんふふ水ふふふんふんふん\nふんふふ水ふふふんふんふん\n");
            System.out.println("カレンダーも縦長に\nテレビも毎日同じ顔\n前の曜日は何だっけ？\nそうだ！昨日も水曜日\n");
            System.out.println("水すす水すす水水水\n水水水水水水水");
        }
    }