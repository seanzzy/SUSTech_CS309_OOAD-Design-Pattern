import subclz.SubClzA;
import subclz.SubClzB;
import subclz.SubClzC;

public class Facade {
    SubClzA subClzA = new SubClzA();
    SubClzB subClzB = new SubClzB();
    SubClzC subClzC = new SubClzC();

    public void doOperations() {
        subClzA.operationA();
        subClzB.operationB();
        subClzC.operationC();
    }
}
