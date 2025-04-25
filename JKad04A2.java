
import java.util.*;

public class JKad04A2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String normal = "";
        String reverse = "";
        String str;

        System.out.print("文字列1>");
        str = name.nextLine();
        normal += str;
        reverse = str + reverse;

        System.out.print("文字列2>");
        str = name.nextLine();
        normal += str;
        reverse=str + reverse;

        System.out.print("文字列3>");
        str = name.nextLine();
        normal += str;
        reverse=str + reverse;


        System.out.print("文字列4>");
        str = name.nextLine();
        normal += str;
        reverse=str + reverse;

        System.out.println("入力順"+ ":" +normal);
        System.out.println("逆 順"+ ":" + reverse);

    }
}
