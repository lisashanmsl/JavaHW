public class ClockTest {
    public static void main(String[] args) {
        Clock clock1 = new Clock(15, 10, 20);
        Clock clock2 = new Clock(14, 25, 34);

        System.out.printf("Clock1=>%n");
        clock1.displayTime();

        clock2.set_hour(21);
        clock2.set_minute(40);
        clock2.set_second(34);

        System.out.printf("Clock2=>%n");
        clock2.displayTime();
    }
}
