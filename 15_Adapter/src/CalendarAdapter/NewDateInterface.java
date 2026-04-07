package CalendarAdapter;

public interface NewDateInterface {
    void setDay(int day);
    void setMonth(int month);
    void setYear(int year);
    int getDay();
    int getMonth();
    int getYear();
    void advanceDays(int days);
//    private int day = 1;
//    private int month = 1;
//    private int year = 0;
//
//    private int[] maxDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//    public NewDateInterface(){}
//    public NewDateInterface(int day, int month, int year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }
//
//    public void setDay(int day){
//        if(day < 1 || day > 31) throw new IllegalArgumentException("Day must be between 1 and 31");
//        if(month == 2 && day > 29) throw new IllegalArgumentException("February cannot have day beyond 29");
//        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) throw new IllegalArgumentException("April, June, September and November cannot have day beyond 30");
//        this.day = day;
//    }
//    public void setMonth(int month){
//        if(month < 1 || month > 12) throw new IllegalArgumentException("Month must be between 1 and 12");
//        this.month = month;
//    }
//    public void setYear(int year){
//        this.year = year;
//    }
//    public int getDay(){
//        return day;
//    }
//    public int getMonth(){
//        return month;
//    }
//    public int getYear(){
//        return year;
//    }
//    public void advanceDays(int days){
//        if(days < 0) throw new IllegalArgumentException("Days cannot be negative");
//        day += days;
//        while(day > maxDay[month-1]) {
//            day -= maxDay[month-1];
//            month++;
//            if(month > 12) {
//                month = 1;
//                year++;
//            }
//        }
//    }
//
//    public String toString(){
//        return String.format("%02d/%02d/%04d", day,  month, year);
//    }
}
