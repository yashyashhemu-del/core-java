class NaviRunner {
    public static void main(String[] args) {

        Navi n1 = new Navi("Hemanth", "Savings", 15000.50, true);
        n1.display();

        Navi n2 = new Navi("Shahsank", "Current", 25000.00, true);
        n2.display();

        Navi n3 = new Navi("Yash", "Savings", 8000.75, false);
        n3.display();

        Navi n4 = new Navi("KL Rahul", "Current", 12000.00, true);
        n4.display();

        Navi n5 = new Navi("Virat Kohli", "Savings", 9500.25, false);
        n5.display();

        Navi n6 = new Navi("ABD", "Savings", 30000.00, true);
        n6.display();

        Navi n7 = new Navi("Revanth", "Current", 5000.00, false);
        n7.display();
    }
}