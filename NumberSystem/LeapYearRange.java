public class LeapYearRange {
     public static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        for (int year = 2002; year <= 3000; year++) {
            if (isLeap(year)) {
                System.out.println(year+"-->it is leap year");
            }
        }
    }
}
