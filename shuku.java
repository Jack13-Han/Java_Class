public class shuku {
    public static void main(String[] args) {
        if (Loop(100)) {
            System.out.println(100 + " は素数です。");
        } else {
            System.out.println(100 + " は素数ではありません。");
        }
    }

    public static void Loop(int x ){
        if(x<=1)
          return false;
        
        
        for (int i = 2; i < x; i++) {
           if(x%1 == 0){
            // return false;
           }
          }

        //   return true;
    }
}
