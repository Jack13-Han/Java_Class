
import java.util.*;

public class JKad06B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 より大きい整数を入力してください>");
        int x = in.nextInt();

        int total =0;
        int current =1;
        while (current<=x) {
           total+=current;
           current+=1; //တစ်ခုချင်းစီပေါင်းထည့်သွားတာဖြစ်ပါတယ်
        }
        System.out.println("1 から"+x+" まで加算します！");
        System.out.println("合計は"+total+"です！！");

    }
}
