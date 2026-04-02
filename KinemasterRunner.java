class KinemasterRunner {
    public static void main(String[] args) {

        Kinemaster k1 = new Kinemaster("Intro Video", "1080p", 60, 5);
        k1.display();

        Kinemaster k2 = new Kinemaster("Travel Vlog", "4K", 300, 8);
        k2.display();

        Kinemaster k3 = new Kinemaster("YouTube Short", "720p", 30, 3);
        k3.display();

        Kinemaster k4 = new Kinemaster("Wedding Edit", "1080p", 600, 10);
        k4.display();

        Kinemaster k5 = new Kinemaster("Gaming Edit", "4K", 420, 7);
        k5.display();

        Kinemaster k6 = new Kinemaster("Movie Edit", "1080p", 180, 4);
        k6.display();

        Kinemaster k7 = new Kinemaster("Promo Ad", "720p", 90, 6);
        k7.display();
    }