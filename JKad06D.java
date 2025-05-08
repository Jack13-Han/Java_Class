import java.util.Scanner;

public class JKad06D {
    public static void main(String[] args) {
         Scanner ball = new Scanner(System.in);


         System.out.print("リンゴの数を入力してください>");
         int x = ball.nextInt();
         System.out.print("食べる人の数を入力してください>");
         int y = ball.nextInt();
         

         while (x >= y) { 
            int z= 0;
             System.out.println("ひとり一つずつリンゴを食べた！");
            int sum=  x-=y;
             System.out.println("残ったリンゴは"+sum+" 個です！");
         }
    }
}
