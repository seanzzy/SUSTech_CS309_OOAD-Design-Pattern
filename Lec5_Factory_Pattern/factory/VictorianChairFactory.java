package factory;

import product.Chair;
import product.ModernChair;
import product.VictorianChair;

public class VictorianChairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
