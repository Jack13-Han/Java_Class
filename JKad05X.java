
import java.util.*;

public class JKad05X {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("こんにちは！");
        System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
        System.out.print("あなたのクラスを教えてね！（0：IE、1：SK、2：SE）＞");
        int x = in.nextInt();

        if(x == 0){
            System.out.println("4 年制コース IE");
        }else if(x ==1){
            System.out.println("3 年制コース SK");
        }else if(x==2){
            System.out.println("2 年制コース SE");
        }else{
            System.out.println("わからない。");
        }
    }
}
