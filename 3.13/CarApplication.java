public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("2005", "BMW", 50000);
        Car car2 = new Car("2000", "Toyota", 10000);

        car1.set_price(60000);
        car2.set_price(20000);

        System.out.printf("Car1 price: %.2f%n", car1.get_price());
        System.out.printf("Car2 price: %.2f%n%n", car2.get_price());

        System.out.println("After discount: ");
        System.out.printf("Car1 price: %.2f%n", car1.get_price() * 0.95);
        System.out.printf("Car2 price: %.2f%n", car2.get_price() * 0.93);
    }
}