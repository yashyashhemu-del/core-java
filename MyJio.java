class MyJio {

    String userName;
    String mobileNumber;
    String planName;
    double dataBalance; // in GB

    public MyJio() {
    }

    public MyJio(String userName, String mobileNumber, String planName, double dataBalance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.planName = planName;
        this.dataBalance = dataBalance;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(mobileNumber);
        System.out.println(planName);
        System.out.println(dataBalance);
        System.out.println("-------------------");
    }
}