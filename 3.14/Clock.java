public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // get and set function
    public void set_hour(int hour) {
        if (hour > 23 || get_minute() > 59 || get_second() > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        this.hour = hour;
    }

    public void set_minute(int minute) {
        if (get_hour() > 23 || minute > 59 || get_second() > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        this.minute = minute;
    }

    public void set_second(int second) {
        if (get_hour() > 23 || get_minute() > 59 || second > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        this.second = second;
    }

    public int get_hour() {
        return hour;
    }

    public int get_minute() {
        return minute;
    }

    public int get_second() {
        return second;
    }

    public void displayTime() {
        System.out.printf("Time: %d:%d:%d%n", hour, minute, second);
    }
}