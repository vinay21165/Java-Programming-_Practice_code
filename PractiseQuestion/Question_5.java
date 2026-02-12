
import java.util.HashSet;
public class Question_5 {

public static boolean isUnique(String s){
    HashSet<Character> sh=new HashSet<Character>();

    for (int i =0;i<=s.length()-1;i++){
        char ch = s.charAt(i);
        sh.add(ch);
    }
    return sh.size()==s.length();
}

    public static void main(String[] args) {
        String s= "Trakin";
        s=s.toLowerCase();
          if( isUnique(s)){
            System.out.println("It is unique string");
          }
          else{
            System.out.println("Not Unique");
          }

    }
}
