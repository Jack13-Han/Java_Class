import java.util.*;

public class JKad06X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("数当てゲーム！");
        int ball = ran.nextInt(101);        
        int y = 1;
        int x= -1;
        while (ball != x) {
            System.out.print(y+" 回目：数値を入力してください>");
             x = in.nextInt();

             if (ball < x) {
                 System.out.println(x+"より小さいです！");
             }
             if(ball > x){
                System.out.println(x+"より大きいです！");
             }
             if (ball ==x ) {
                 System.out.println("正解しました！");
             }

             y++;

        }
        

    }
}
