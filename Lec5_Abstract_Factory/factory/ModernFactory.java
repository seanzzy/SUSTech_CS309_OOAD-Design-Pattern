package factory;

import product.Chair;
import product.ModernChair;
import product.ModernTable;
import product.Table;

public class ModernFactory implements Factory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
