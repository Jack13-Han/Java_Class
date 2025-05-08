
import java.util.*;

public class JKad06A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("9 桁までの正の整数を入力してください>");
        int x= in.nextInt();

        String z= "1";
        while (x>1) { 
           int y = x%10;
           x/=10;
            System.out.println(z+" の位は"+y);
            z+=0;
        }
    }
    
}
