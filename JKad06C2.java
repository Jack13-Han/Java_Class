
import java.util.*;

public class JKad06C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 より大きい整数を入力してください>");
        int x = in.nextInt();
        int y= 1;
        while (y<=x) { 
            System.out.println(y);
            y+=1;
        }
    }
}
