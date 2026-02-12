public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
           System.out.println("Original Number:  " + num);
           System.out.println("Reversed  number: " +reverseNumber(num));
    }

    public static int   reverseNumber(int num){
        int rev=0;
        while(num>0){
            int rem =num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        
        return rev;
    }
}
