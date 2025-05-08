
import java.util.*;

public class JKad06A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数1 を入力してください＞");
        int x = in.nextInt();
        
        System.out.print("整数2 を入力してください>");
        int y= in.nextInt();

        int a = 0;

        System.out.println(x+"÷"+y+" を計算します！");
        while (x>=y) { 
            a++;
             x-=y;
        }
        System.out.println("商は"+a+"、余りは"+x+" です！");
    }
}
