public class Car {
    // instance variable
    private String year;
    private String model;
    private double price;

    // constructor
    public Car(String year, String model, double price) {
        this.model = model;
        this.year = year;
        if (price > 0) {
            this.price = price;
        }
    }

    // get and set function
    public void set_model(String model) {
        this.model = model;
    }

    public void set_year(String year) {
        this.year = year;
    }

    public void set_price(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String get_model() {
        return model;
    }

    public String get_year() {
        return year;
    }

    public double get_price() {
        return price;
    }

}