package implLayer;

public class TV implements Device{
    private boolean enable = false;
    private int volume = 0;

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) volume = 100;
        else if (volume < 0) volume = 0;
        this.volume = volume;
    }
}
