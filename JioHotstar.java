class JioHotstar {

    String showName;
    String language;
    int subscriptionPrice;
    double rating;

    public JioHotstar() {
    }

    public JioHotstar(String showName, String language, int subscriptionPrice, double rating) {
        this.showName = showName;
        this.language = language;
        this.subscriptionPrice = subscriptionPrice;
        this.rating = rating;
    }

    public void display() {
        System.out.println(showName);
        System.out.println(language);
        System.out.println(subscriptionPrice);
        System.out.println(rating);
        System.out.println("-------------------");
    }
}

