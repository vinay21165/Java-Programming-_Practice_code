public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int year = 2024;
       if(isLeapYear(year)){
          System.out.println("Leap yaear");
       }
       else{}
       System.out.println("Not leap year");


     //  System.out.println(isLeapYear(year) ? "Leap Year" : "Not Leap Year");

     //(Ternary Operator):
     //Ye ek line me hi decision le leta hai:
        // Condition true → "Leap Year"
        // Condition false → "Not Leap Year"
    }
}
