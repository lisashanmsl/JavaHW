public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        if(month <= 12 && month > 0){
            this.month = month;
        }
        this.day = day;
        this.year = year;
    }
    public void set_month(int month){
        if(month <= 12 && month > 0){
            this.month = month;
        }
    }
    public void set_day(int day){
        this.day = day;
    }
    public void set_year(int year){
        this.year = year;
    }
    public int get_month(){
        return month;
    }
    public int get_day(){
        return day;
    }
    public int get_year(){
        return year;
    }
    public void display(){
        System.out.printf("Date: %d/%d/%d%n",month,day,year);
    }
}