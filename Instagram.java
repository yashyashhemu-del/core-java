class Instagram {

    String userName;
    int userId;
    boolean isPublic;
    int followersCount;
    double accountBalance;

    public Instagram(String i1, int i2, boolean i3, int i4, double i5) {
        userName = i1;
        userId = i2;
        isPublic = i3;
        followersCount = i4;
        accountBalance = i5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isPublic);
        System.out.println(followersCount);
        System.out.println(accountBalance);
    }
}