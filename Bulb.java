class Bulb {

    String brand;
    int watt;
    boolean isLed;
    double price;
    String color;

    public Bulb(String brand, int watt, boolean isLed, double price, String color) {
        this.brand = brand;
        this.watt = watt;
        this.isLed = isLed;
        this.price = price;
        this.color = color;
    }

    public void display() {
        System.out.println(brand);
        System.out.println(watt);
        System.out.println(isLed);
        System.out.println(price);
        System.out.println(color);
    }
}