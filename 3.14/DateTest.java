public class DateTest {
    public static void main(String[] args){
        Date date1 = new Date(10,1,2024);
        System.out.println("Initial date");
        date1.display();

        date1.set_month(5);
        date1.set_day(29);
        date1.set_year(2005);

        System.out.println("Date after set");
        date1.display();
    }
}
