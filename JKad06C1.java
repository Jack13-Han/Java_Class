
import java.util.*;

public class JKad06C1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 より大きい整数を入力してください>");
        int x= in.nextInt();

        while (x>=1) { 
            System.out.println(x);
            x--;
        }

    }
}
