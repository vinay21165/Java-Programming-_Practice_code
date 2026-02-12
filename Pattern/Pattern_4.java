public class Pattern_4 {
    public static void main(String[] args) {
        
    int n=7;
    for(int i=1;i<=(n/2)+1;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=2;i<=n/2+1;i++){
        for(int j=1;j<=((n/2-i)+1);j++){
             System.out.print("*");

        }
        System.out.println();
    }
  }
}
