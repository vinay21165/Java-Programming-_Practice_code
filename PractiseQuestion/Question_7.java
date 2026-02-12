public class Question_7 {
    public static void main(String[] args) {
        String input = "a2b3c2";
           String result="";
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);         
            int count = input.charAt(i + 1) - '0';  

            for (int j = 0; j < count; j++) {
                result=result+ch;
            }
        }

        System.out.println(result);
    }
}
