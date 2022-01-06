package factory;

import product.Chair;
import product.ModernChair;

public class ModernChairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
