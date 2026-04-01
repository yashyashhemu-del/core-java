class WhatsApp {

    String userName;
    int userId;
    boolean isOffline;
    int contactsNumers;
    double dataBalance;

    public WhatsApp(String w1, int w2, boolean w3, int w4, double w5) {
        userName = w1;
        userId = w2;
        isOffline = w3;
        contactsNumbers = w4;
        dataBalance = w5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isOnline);
        System.out.println(contactsNumbers);
        System.out.println(dataBalance);
    }
}