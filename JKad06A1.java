
import java.util.*;

public class JKad06A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数1 を入力してください＞");
        int x = in.nextInt();
        
        System.out.print("整数2 を入力してください>");
        int y= in.nextInt();

        System.out.println(x+"÷"+y+" を計算します！");
        System.out.println("商は"+(x/y)+"、余りは"+(x%y)+" です！");
    }
}
