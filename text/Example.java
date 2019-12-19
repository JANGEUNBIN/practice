package practice;
import java.util.Calendar;

public class Practice {
	public static void main(String[] args) {
		int num = 0;

		num = num++;
		num = num++;
		num = num++;

		System.out.println(num);

//--------------------------------------------------------------------------------------------

		System.out.println("--------------------");

	    int x = 50;
	    int y = 50;

	    if(x == y) {
		    System.out.println("X는 Y보다 작습니다.");
		    System.out.println("Test");
	    } else if(x == y) {
		    System.out.println("X는 Y보다 작습니다.");
	    }

	    if(x < y)
		    System.out.println("X는 Y보다 작습니다.");

		    System.out.println("나는 바로 위 if문과 관련이 없어 출력이 됩니다.");

//--------------------------------------------------------------------------------------------

		System.out.println("--------------------");

	    boolean b1 = true;
	    boolean b2 = false;
	    boolean b3 = true;

	    //논리곱 (&&, &) - 피연산자가 모두 true일 경우에만 연산 결과가 true 이다.
	    System.out.println(b1 && b2); //-> b2가 false 이므로 결과는 false
	    System.out.println(b1 && b3); //-> b1과 b2 모두 true 이므로 결과는 true

	    //논리합 (||,|) - 피연산자 중 하나만 true이면 연산 결과는 true 이다.
		System.out.println(b1 || b2); //-> b1 이 true이므로 결과는 true 이다.

		//배타적 논리합 () -> 피연산자가 서로 다른 값일 경우만 연산 결과가 true 이다.
		System.out.println(b1 ^ b2); //-> b1은 true, b2는 false로 서로 다르므로 결과는 true 이다.
		System.out.println(b1 ^ b3); //-> b1, b3 모두 true로 서로 같다. 결과는false 이다

		//논리 부정 (!) -> 피연산자의 논리값을 바꾼다. true는 false로 false는 true로 바꾼다.
		System.out.println(!b1); //-> b1 이 true 이므로 결과는 false 이다.
		System.out.println(!b2); //-> b1 이 false 이므로 결과는 true 이다.

		//^ 두 값이 다를 때만 true
		System.out.println(b1 ^ b2); //-> b1 이 true b2 이 false 이므로 결과는 true 이다.
		System.out.println(b1 ^ b3); //-> b1 이 true b3 이 true 이므로 결과는 false 이다.

		System.out.println("--------------------");

//--------------------------------------------------------------------------------------------

		//5가 4보다 크다면 50이라는 값을 c1에, 아니라면 40이라는 값을 c1에 넣는다
		int c1 = (5 > 4) ? 50 : 40;
		int c2 = (5 < 4) ? 50 : 40;
		System.out.println(c1);
		System.out.println(c2);


		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항연산자를 이용해서 ampm의 값을 "오전" 또는 "오후"로 만들어보세요.
        ampm = hour > 12 ? "오후" : "오전";

        System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");

		System.out.println("--------------------");

//--------------------------------------------------------------------------------------------

		// month에는 오늘이 몇 월인지 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
       switch(month) {
	       case 3:
	       case 4:
	       case 5:
	           season = "봄";
	           break;
	       case 6:
	       case 7:
	       case 8:
	           season = "여름";
	           break;
	       case 9:
	       case 10:
	       case 11:
	           season = "가을";
	           break;
	       case 12:
	       case 1:
	       case 2:
	           season = "겨울";
	           break;
       }

        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");

		System.out.println("--------------------");

 //--------------------------------------------------------------------------------------------

        int total = 0; // i의 값을 누적할 변수를 선언합니다.
        int i = 1;
        while(i <= 100){
            total = total + i;
            i++;
        }
        System.out.println(total);

        
        
        System.out.println("--------------------");

        
        
        int g = 1;
        while(g < 11){
            // if 문을 추가해, i가 짝수일때만 i를 출력하는 코드를 짜보세요.
            if(g % 2 == 0) {
                System.out.println(g);
            }
            g++;   
        }
        
        
	}
}