public class Question_2 {
    public static boolean isAnagram(String s1, String s2) {
        char ch1 []=s1.toCharArray();
      char ch2 []=s2.toCharArray();
       for (int i = 0; i <=ch1.length-1; i++) {
        boolean found =false;
           for (int j = 0; j <=ch2.length-1; j++) {
               if(ch1[i]==ch2[j]){
                found= true;
                break;
               }
            }
             if(!found){
                return false;
       }
       }
       return true;
    }
public static void main(String[] args) {
    String s1="listen";
    String s2="silent";
    if(isAnagram(s1,s2)){
        System.out.println("yes ");
    }
    else{
        System.out.println("not");
    }
}
}
