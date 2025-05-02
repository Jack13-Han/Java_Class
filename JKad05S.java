
import java.util.*;

public class JKad05S {
    public static void main(String[] args) {
        Random in = new Random();
        Scanner result = new Scanner(System.in);
        
        System.out.println("こんにちは！");
        System.out.println("わたしは占いマシーンのECC1000 よ！");
        System.out.println("あなたのことを占ってあげるわ！よろしくね");

        System.out.print("名前は何ていうの？>");
        String x = result.nextLine();

        System.out.print("年齢はいくつ?");
        int y = result.nextInt();

        System.out.println(x+"さん、こんにちは！");
        System.out.println("あなたは"+y+"歳なんですね！");

        System.out.println(x+"さんの今日の運勢は");

        int num1 = in.nextInt(100);
        int num2 = in.nextInt(100);
        int num3 = in.nextInt(100);

        System.out.println("ラブ運\t"+num1);
        System.out.println("金銭運\t"+num2);
        System.out.println("全体運\t"+num3);

        int sum = num1;

        if (sum<num2) {
            sum=num2;
        }
        if (sum<num3) {
            sum=num3;
        }
        if (sum==num1) {
            System.out.println("一番高いのはラブ運の"+sum+" ね！");
        }
        if(sum==num2){
            System.out.println("一番高いのは金銭運の"+sum+" ね！");
        }
        if (sum==num3) {
            System.out.println("一番高いのは全体運の"+sum+" ね！");
        }


    }
}
