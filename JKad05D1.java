import java.util.Scanner;

public class JKad05D1 {
   public static void main(String[] args) {
       
    Scanner number = new Scanner(System.in);
    System.out.print("ひとつめの整数を入力してください＞");
    int x= number.nextInt() ;


    System.out.print("ふたつめの整数を入力してください＞");
    int y = number.nextInt();
    
    int max =x;
     max=x;
    if(max < y){
        max =y;
        System.out.println("ふたつの数字で大きい方は"+max+"です！");
    }else{
         System.out.println("NO");
    }

   }

}
