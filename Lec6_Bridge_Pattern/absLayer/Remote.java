package absLayer;

import implLayer.Device;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnable()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public int getVolume() {
        return device.getVolume();
    }
}
