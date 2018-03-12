public class MP3Player implements IConnect {
    public MP3Player() {

    }

    public String connect(Stero stero) {
        return "Connected to " + stero.getName();
    }
}
