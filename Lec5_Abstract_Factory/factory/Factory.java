package factory;

import product.Chair;
import product.Table;

public interface Factory {
    Chair createChair();
    Table createTable();
}
