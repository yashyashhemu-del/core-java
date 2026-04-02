class Kinemaster {

    String videoName;
    String resolution;
    int duration; // in seconds
    int layersUsed;

    public Kinemaster() {
    }

    public Kinemaster(String videoName, String resolution, int duration, int layersUsed) {
        this.videoName = videoName;
        this.resolution = resolution;
        this.duration = duration;
        this.layersUsed = layersUsed;
    }

    public void display() {
        System.out.println(videoName);
        System.out.println(resolution);
        System.out.println(duration);
        System.out.println(layersUsed);
        System.out.println("-------------------");
    }
}


}