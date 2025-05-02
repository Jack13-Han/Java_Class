import java.util.Scanner;

public class JKad05C2 {
    public static void main(String[] args) {
        Scanner ball = new Scanner(System.in);


        System.out.println("ひとり一つずつリンゴを食べます！");
        System.out.print("リンゴの数を入力してください＞");
        int apple = ball.nextInt();

        System.out.print("食べる人の数を入力してください＞");
        int people = ball.nextInt();

        if(apple >= people){
            System.out.println("ひとり一つずつリンゴを食べた！");
            int x = apple-people;
            System.out.println("残ったリンゴは"+x+"個です！");

        }else{
           System.out.println("リンゴの数が足りません！");
            
        }

    }
}
