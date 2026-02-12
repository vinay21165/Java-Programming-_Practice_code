public class Question_8 {
    public static void main(String[] args) {
      String sentence = "Java is a powerful programming language";

        String smallest = "";
        String biggest = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word = word + ch;   // word build kar rahe hain
            } else {
                // space mila matlab word complete
                if (smallest.equals("") || word.length() < smallest.length()) {
                    smallest = word;
                }

                if (biggest.equals("") || word.length() > biggest.length()) {
                    biggest = word;
                }

                word = ""; // reset for next word
            }
        }

        // Last word handle karne ke liye (kyunki last me space nahi hota)
        if (smallest.equals("") || word.length() < smallest.length()) {
            smallest = word;
        }

        if (biggest.equals("") || word.length() > biggest.length()) {
            biggest = word;
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Biggest word: " + biggest);
    }
}
