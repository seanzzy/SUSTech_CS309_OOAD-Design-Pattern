import absLayer.AdvancedRemote;
import absLayer.Remote;
import implLayer.Device;
import implLayer.TV;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote remote = new Remote(tv);

        System.out.println(tv.isEnable());
        remote.togglePower();
        System.out.println(tv.isEnable());

        AdvancedRemote adv = new AdvancedRemote(tv);
        adv.setVolume(1000);
        System.out.println(adv.getVolume());
    }
}
