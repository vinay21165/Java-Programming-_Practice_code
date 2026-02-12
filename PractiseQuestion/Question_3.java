import java.util.HashSet;

public class Question_3 {

    public static boolean isPangram(String s){
          HashSet sh=new HashSet();
        for (int i=0;i<=s.length()-1;i++){
        char ch= s.charAt(i);
         if(Character.isAlphabetic(ch)){
            sh.add(ch);
         }
        }
        return sh.size()==26;
    }
    public static void main(String[] args) {
        String s="qweriopasdfghjklzxcvbnm1235@$%";
         s=s.toLowerCase();

         if(isPangram(s)){
            System.out.println("yes it is pangram");
         } else{
            System.out.println("Not pnagram");
         }
    }
}
