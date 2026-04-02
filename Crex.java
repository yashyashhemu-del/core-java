class Crex {

    String matchName;
    String team;
    int score;
    int overs;

    public Crex() {
    }

    public Crex(String matchName, String team, int score, int overs) {
        this.matchName = matchName;
        this.team = team;
        this.score = score;
        this.overs = overs;
    }

    public void display() {
        System.out.println(matchName);
        System.out.println(team);
        System.out.println(score);
        System.out.println(overs);
        System.out.println("-------------------");
    }
}

