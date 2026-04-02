class InstagramPro {

    String userName;
    int followers;
    int posts;
    boolean isVerified;

    public InstagramPro() {
    }

    public InstagramPro(String userName, int followers, int posts, boolean isVerified) {
        this.userName = userName;
        this.followers = followers;
        this.posts = posts;
        this.isVerified = isVerified;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(followers);
        System.out.println(posts);
        System.out.println(isVerified);
        System.out.println("-------------------");
    }
}