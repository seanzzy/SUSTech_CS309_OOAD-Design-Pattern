package absLayer;

import implLayer.Device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setVolume(int v) {
        device.setVolume(v);
    }

}
