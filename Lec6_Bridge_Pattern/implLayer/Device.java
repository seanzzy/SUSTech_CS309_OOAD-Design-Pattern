package implLayer;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    void setVolume(int v);
    int getVolume();
}
