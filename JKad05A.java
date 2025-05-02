
import java.util.*;

public class JKad05A {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner result = new Scanner(System.in);

        int num1 = number.nextInt(100);
        System.out.print("のび太の点数を入力してください>"+num1+"\n");
        

        int num2 = number.nextInt(100);
        System.out.print("しずかちゃんの点数を入力してください>"+num2+"\n");
        

        int num3 = number.nextInt(100);
        System.out.print("ジャイアンの点数を入力してください>"+num3+"\n");
        

        int num4 = number.nextInt(100);
        System.out.print("スネ夫の点数を入力してください>"+num4 +"\n");
        

        int num5 = number.nextInt(100);
        System.out.print("出木杉の点数を入力してください>"+num5 +"\n");

        int max = num1;

        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        if(max<num4){
            max=num4;
        }
        if(max<num5){
            max=num5;
        }

        System.out.println("一番高い点数は"+max+" 点です！");
        




    }
}
