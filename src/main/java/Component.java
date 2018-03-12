public abstract class Component {
    private String name;
    private String currentMedia;
    private boolean playing;

    public Component(String name) {
        this.name = name;
        this.currentMedia = "empty";
        this.playing = false;
    }

    public String getCurrentMedia() {
        return currentMedia;
    }

    public String getName() {
        return name;
    }

    public void load(String media) {
        if (currentMedia.equals("empty")) {
            currentMedia = media;
        }
    }

    public void unload() {
        this.stop();
        currentMedia = "empty";
    }

    public boolean isLoaded() {
        if (currentMedia.equals("empty")) {
            return false;
        }
        else {return true;}
    }

    public String play() {
        if (this.isLoaded()) {
            this.playing = true;
            return currentMedia + " is playing";
        }
        else {return "No media loaded";}
    }

    public void stop() {
        this.playing = false;
    }

}
