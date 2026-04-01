class GasRunner {
    public static void main(String[] args) {

        Gas g1 = new Gas("LPG", 1100.50, true, 40, "Indane");
        g1.show();

        Gas g2 = new Gas("CNG", 900.75, false, 25, "HP Gas");
        g2.show();
    }
}