class BookMyShowRunner {
    public static void main(String[] args) {

        BookMyShow b1 = new BookMyShow("KGF", "PVR", 250);
        b1.display();

        BookMyShow b2 = new BookMyShow("RRR", "INOX", 300);
        b2.display();

        BookMyShow b3 = new BookMyShow("Pushpa", "Cinepolis", 280);
        b3.display();

        BookMyShow b4 = new BookMyShow("Salaar", "PVR", 320);
        b4.display();

        BookMyShow b5 = new BookMyShow("Leo", "INOX", 270);
        b5.display();

        BookMyShow b6 = new BookMyShow("Jawan", "Cinepolis", 350);
        b6.display();

        BookMyShow b7 = new BookMyShow("Animal", "PVR", 300);
        b7.display();
    }
}