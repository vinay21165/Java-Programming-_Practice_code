 class Question_4 {
    public static boolean isPalindrome(String sub){
    String rev= new StringBuffer(sub).reverse().toString();
    return rev.equals(sub);
    }
    public static void main(String[] args) {
        String s="abcacb";
        String longest="";
        for(int i=0;i<=s.length()-1;i++)
        {
            for(int j=i+1;j<=s.length();j++)
                
        {
             String sub =s.substring(i,j);
              if(isPalindrome(sub))       
         {
            
             if(sub.length()>longest.length())
            {
                longest=sub;
              //   System.out.println(longest);
            }
         }   
       }  
    }
       System.out.println(longest);  
    }
}

