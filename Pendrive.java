class Pendrive {

    String brand;
    int storageCapacity;   // in GB
    double price;
    boolean isUsb3;
    String color;

    public Pendrive(String brand, int storageCapacity, double price, boolean isUsb3, String color) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.price = price;
        this.isUsb3 = isUsb3;
        this.color = color;
    }

    public void display() {
        System.out.println(brand);
        System.out.println(storageCapacity);
        System.out.println(price);
        System.out.println(isUsb3);
        System.out.println(color);
    }
}