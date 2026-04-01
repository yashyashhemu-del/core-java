class PendriveRunner {
    public static void main(String[] args) {

        Pendrive p1 = new Pendrive("SanDisk", 64, 599.99, true, "Black");
        p1.display();

        Pendrive p2 = new Pendrive("HP", 32, 399.50, false, "Silver");
        p2.display();
    }
}