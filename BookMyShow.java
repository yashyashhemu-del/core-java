class BookMyShow {

    String movieName;
    String theatreName;
    int ticketPrice;

    public BookMyShow() {
    }

    public BookMyShow(String movieName, String theatreName, int ticketPrice) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.ticketPrice = ticketPrice;
    }

    public void display() {
        System.out.println(movieName);
        System.out.println(theatreName);
        System.out.println(ticketPrice);
        System.out.println("-------------------");
    }
}