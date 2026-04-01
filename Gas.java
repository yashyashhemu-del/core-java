class Gas {

    String gasType;
    double pricePerCylinder;
    boolean isAvailable;
    int cylindersInStock;
    String supplierName;

    public Gas(String gasType, double pricePerCylinder, boolean isAvailable, int cylindersInStock, String supplierName) {
        this.gasType = gasType;
        this.pricePerCylinder = pricePerCylinder;
        this.isAvailable = isAvailable;
        this.cylindersInStock = cylindersInStock;
        this.supplierName = supplierName;
    }

    public void display() {
        System.out.println(gasType);
        System.out.println(pricePerCylinder);
        System.out.println(isAvailable);
        System.out.println(cylindersInStock);
        System.out.println(supplierName);
    }
}