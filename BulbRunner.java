class BulbRunner {
    public static void main(String[] args) {

        Bulb b1 = new Bulb("Philips", 9, true, 150.75, "White");
        b1.display();

        Bulb b2 = new Bulb("Havells", 12, true, 200.50, "Warm White");
        b2.display();
    }
}