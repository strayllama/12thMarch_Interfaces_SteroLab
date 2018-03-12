public class CDPlayer extends Component implements IPause, INavigate{

    public CDPlayer(String name) {
        super(name);
    }

    @Override
    public String next() {
        if (this.isLoaded()) {
            return "Skipping to next track";
        }
        return "Not loaded";
    }

    @Override
    public String previous() {
        if (this.isLoaded()) {
            return "Skipping to previous track";
        }
        return "Not loaded";
    }

    @Override
    public String manualForward() {
        if (this.isPlaying()) {
            return "Fast forwarding cd....";
        }
        return "Can't fast forward";
    }

    @Override
    public String manualBackward() {
        if (this.isPlaying()) {
            return "Fast rewinding cd....";
        }
        return "Can't fast rewind";
    }

    @Override
    public String pause() {
        this.stop();
        return "Paused";
    }
}
