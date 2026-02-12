

public class Pattern_1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= 5; j++) {
               // System.out.print(" *");
               if(j%2==0){
                System.out.print(" 0 ");
               }else{
                System.out.print(" 1 ");
               }
            }
            System.out.println();
        }
    }
}
