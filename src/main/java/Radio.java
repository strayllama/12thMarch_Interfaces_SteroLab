public class Radio implements INavigate {
    private String currentStation;
    private String name;

    public Radio(String name) {
        this.name = name;
        this.currentStation = null;
    }

    public String getName() {
        return this.name;
    }

    public String getCurrentStation() {
        return this.currentStation;
    }



    @Override
    public String next() {
        return "Skipped to next station";
    }

    @Override
    public String previous() {
        return "Skipped back a station";
    }

    @Override
    public String manualForward() {
        return "Tuning up a bit";
    }

    @Override
    public String manualBackward() {
        return "Tuning down a bit";
    }
}
