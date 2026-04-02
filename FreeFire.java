class FreeFire {

    String playerName;
    int level;
    int kills;
    String rank;

    public FreeFire() {
    }

    public FreeFire(String playerName, int level, int kills, String rank) {
        this.playerName = playerName;
        this.level = level;
        this.kills = kills;
        this.rank = rank;
    }

    public void display() {
        System.out.println(playerName);
        System.out.println(level);
        System.out.println(kills);
        System.out.println(rank);
        System.out.println("-------------------");
    }
}

