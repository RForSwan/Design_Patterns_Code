import CalendarAdapter.CalendarToNewDateAdapter;
import CalendarAdapter.NewDateInterface;

void main() {
    NewDateInterface date1 = new CalendarToNewDateAdapter(10,Calendar.MARCH,2006);
    System.out.println(date1);
    date1.advanceDays(40);
    System.out.println(date1);

}
