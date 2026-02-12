public class Question_6 {

    public static String reverse(String s){
        return new StringBuffer(s).reverse().toString();
    }
    public static void main(String[] args) {
        String s="ram is good";
          String a[]=s.split(" ");
          String res="";
          for(int i=0;i<=a.length-1;i++){
                String rev= reverse(a[i]);
                res =res+rev+" ";
          }
      System.out.println(res);
    }
}
