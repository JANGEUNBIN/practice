import java.util.Scanner;

public class Kuumen {
	
	public static void main(String[] args) {
		String mawaru = "";
		
		while(true) {
			mawaru = nayamino_taberumen();
			if(mawaru == "お前はもう死んでいる") {
				System.out.println(mawaru);
				break;
			}
		}
	}
	
	public static String nayamino_taberumen() {
		System.out.println("***お昼ご飯何食べるマン***");
        System.out.println("[選べ] 0:終わる 1:食べるマン 2:眠いマン 3:貧乏マン");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("選べを選ぶ:");
        int selected = scanner.nextInt();
        
        switch(selected) {
        	case 0:
        		return "お前はもう死んでいる";
        	case 1:
                int menu = new java.util.Random().nextInt(9);
                menu++;

                System.out.println("*****メニュー*****");
                System.out.println("1:ラメン 2:うどん 3:松屋 4:カレー 5:ハンバーガー 6:やゆよ 7:今泉キッチン 8:オムライス 9:コンビニ");
                System.out.println("今日のお昼は:" + menu);
                break;
                
            case 2:
                System.out.println("眠すぎる");
                int neruu = new java.util.Random().nextInt(2);
                // System.out.println(neruu);
                    if(neruu == 0){
                        System.out.println("眠いマンも食べるんだ");
                    }else{
                        System.out.println("眠いマンはねんねして"); 
                    }
                    break;
                    
            case 3:
               int yasuiMenu = new java.util.Random().nextInt(5);
               yasuiMenu++;
               
               System.out.println("*****メニュー*****");
               System.out.println("1:ラーメン 2:うんどん 3:牛丼 4:ハンバーガー 5:コンビニ");
               System.out.println("今日のお昼は:" + yasuiMenu);
               break;
            }
        System.out.println("--------------------------------------------------");
        
        return "戻る";
	}
}
