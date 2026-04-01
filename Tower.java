class Tower {

    String towerName;
    int numberOfFloors;
    boolean hasLift;
    double height;
    String location;

    public Tower(String towerName, int numberOfFloors, boolean hasLift, double height, String location) {
        this.towerName = towerName;
        this.numberOfFloors = numberOfFloors;
        this.hasLift = hasLift;
        this.height = height;
        this.location = location;
    }

    public void display() {
        System.out.println(towerName);
        System.out.println(numberOfFloors);
        System.out.println(hasLift);
        System.out.println(height);
        System.out.println(location);
    }
}