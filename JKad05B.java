
import java.util.*;

public class JKad05B {
    public static void main(String[] args) {
        Scanner ball= new Scanner(System.in);
        Random number = new Random();
        
        int x = number.nextInt(6);
        int y = number.nextInt(6);

        System.out.print("出た目の和が偶数か奇数か予想してください(0:偶数、1:奇数)>");
        int z= ball.nextInt();
        
        System.out.println("ひとつめは"+x+"!");
        System.out.println("ふたつめは"+y+"!");
        int n = x+y;
        System.out.println("合わせて="+n+"!");

        if(n%2 == 0){
            System.out.println("偶数でした！");
        }else{
            System.out.println("奇数でした!");
        }
        
        
        if(n%2 == z){
            System.out.println("あなたの勝ち！");
        }
        else{
            System.out.println("あなたの負け！");
        }
    }
}
