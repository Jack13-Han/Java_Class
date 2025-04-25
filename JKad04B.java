import java.util.Scanner;

public class JKad04B {

    public static  void  Calculator(int x){
        int sum = 0;
        for (int i =0 ;i<=x;++i){
			sum +=i;
		}
        System.out.println("1 から"+x+"まで足し合わせると・・・"+sum+"になりました！\r");
    }
    public static void main(String[] args) {
        Scanner ball = new Scanner(System.in);
        int number= ball.nextInt() ;
        System.out.print("いくつまで足し合わせますか？");

        Calculator(number);
       

        
    
    }

    
}
