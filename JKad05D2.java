import java.util.*;

public class JKad05D2 {
    public static void main(String[] args) {
        Scanner ball = new Scanner(System.in);
        System.out.print("こんにちは！\n" );
        System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
        System.out.print("あなたのクラスを教えてね!(0:IE、1:SK、2:SE)>");
        int x= ball.nextInt();

        if(x == 0){
            System.out.println("4 年制コース");
        }else if(x ==1){
            System.out.println("3 年制コース");
        }else{
            System.out.println("2 年制コース");
        }

    }
}
