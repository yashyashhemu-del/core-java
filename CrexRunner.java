class CrexRunner {
    public static void main(String[] args) {

        Crex c1 = new Crex("RCB vs CSK", "RCB", 180, 20);
        c1.display();

        Crex c2 = new Crex("MI vs KKR", "MI", 165, 20);
        c2.display();

        Crex c3 = new Crex("DC vs SRH", "SRH", 172, 20);
        c3.display();

        Crex c4 = new Crex("RR vs PBKS", "RR", 150, 20);
        c4.display();

        Crex c5 = new Crex("GT vs LSG", "GT", 190, 20);
        c5.display();

        Crex c6 = new Crex("IND vs AUS", "IND", 210, 20);
        c6.display();

        Crex c7 = new Crex("ENG vs NZ", "NZ", 175, 20);
        c7.display();
    }
}