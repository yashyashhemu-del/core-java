class Navi {

    String userName;
    String accountType;
    double balance;
    boolean isKYCCompleted;

    public Navi() {
    }

    public Navi(String userName, String accountType, double balance, boolean isKYCCompleted) {
        this.userName = userName;
        this.accountType = accountType;
        this.balance = balance;
        this.isKYCCompleted = isKYCCompleted;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(accountType);
        System.out.println(balance);
        System.out.println(isKYCCompleted);
        System.out.println("-------------------");
    }
}