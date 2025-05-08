
import java.util.*;

public class JKad06A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("9 桁までの正の整数を入力してください>");
        int x= in.nextInt();

        String z= "1"; //ဒါက ရှေမှာ ၁ တွေဘဲ ထားချင်လို့ Integer(int) ကိုမလုပ်ဘဲ String အဖြစ်ထားလိုက်တာ
        while (x>1) { 
           int y = x%10; //အကြွင်းတွေဖော်ပြချင်လို့ ဒီလိုရေးထားတာ
           x/=10;
            System.out.println(z+" の位は"+y);
            z+=0; //ရှေ့မှာထားထားတဲ့ ၁ တွေရဲ့ အနောက်မှာ ၀ တွေ လိုက်ချင်ရင် လို့ ဒီလို Loop ထည့်လိုက်တာ
        }
    }
    
}
