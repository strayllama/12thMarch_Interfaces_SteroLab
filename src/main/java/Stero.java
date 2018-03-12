public class Stero {
    private String name;
    private CDPlayer cdPlayer;
    private Radio radio;
    private int volume;

    public Stero(String name) {
        this.name = name;
        this.cdPlayer = new CDPlayer("SONY BetaI");
        this.radio = new Radio("FM/AM Master");
        this.volume = 0;
    }

    public String getName() {
        return this.name;
    }



}
