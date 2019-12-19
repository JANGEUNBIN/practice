package practice;

public class Example2 {
    public int[] makeArray() {
        // 길이가 5인 정수형 배열 array를 만들어보세요.
        // array의 원소는 차례로 1, 2, 3, 4, 5 여야합니다.
        int[] array = {1, 2, 3, 4, 5};

        return array;
    }

    public static void main(String[]args) {
    	Example2 exam = new Example2();
        int [] array = exam.makeArray();
        if(array.length==5 &&
            array[0] ==1 &&
            array[1] ==2 &&
            array[2] ==3 &&
            array[3] ==4 &&
            array[4] ==5){
            System.out.println("정답입니다.");
        }
        else{
            System.out.println("틀렸습니다.");
        }

    System.out.println("--------------------");

 //--------------------------------------------------------------------------------------------

     int [] iarray = new int[100];
   	 	iarray[0] = 1;
   	 	iarray[1] = 2;

   	 	System.out.println(iarray.length);
   	 //배열명.length는 배열의 전체 크기를 알 수 있음

   	 for(int i = 0; i < iarray.length; i++) {
    	 iarray[i] = i + 1;
   	 }

   	 int sum = 0;
   	 for(int i = 0; i < iarray.length; i++) {
   		 sum = sum + iarray[i];
   	 }
   	 System.out.println(sum);

   	System.out.println("--------------------");

    }
}
