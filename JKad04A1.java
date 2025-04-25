import java.util.Scanner;

public class JKad04A1 {
   public static void main(String[] args) {
       
    Scanner ball = new Scanner(System.in);
    System.out.print("教室番号を入力してください＞");
    int x= ball.nextInt() ;
    System.out.println(x);

    int a = x%10 ;
    int b = (x/10);// 370
    int c =b%10; // 0
    int d = b/10; //37 အကြွင်း
    int e = d%10 ; 
    int f = d/10;

    System.out.println("一の位 \t" +a);
    System.out.println("十の位 \t" +c);
    System.out.println("百の位 \t" +e);
    System.out.println("千の位 \t" +f);


   }

}
