import java.util.Random;
import java.util.Scanner;

public class JKad07S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ball = new Random();
        System.out.println("じゃんけんをします！");
        System.out.print("何の手を出しますか？（0:グー、1:チョキ、2:パー）>");
        int x= in.nextInt();

        int random = ball.nextInt(3);

        if (x==0){
            System.out.println("あなたはグーを出した！");
            if (x!=1){
                System.out.println("コンピュータはチョキを出した！");
                System.out.println("あなたの勝ち！");
            }if (x!=2){
                System.out.println("コンピュータはパーを出した！");
                System.out.println("あなたの負け！");
            }
        }
        if (x==1){
            System.out.println("あなたはチョキを出した！");
        }
        if (x==2)
            System.out.println("あなたはパーを出した！");
    }
}
