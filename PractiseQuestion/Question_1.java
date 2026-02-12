public class Question_1 {
public static void main(String []args){
      String s = "abcdab";
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (b[i] == false) {
                int count = 0;

                for (int j = 0; j < s.length(); j++) {
                    if (ch[i] == ch[j]) {
                        count++;
                        b[j] = true;
                    }
                }

                System.out.println(ch[i] + " --> " + count);
            }
        }
}
}
