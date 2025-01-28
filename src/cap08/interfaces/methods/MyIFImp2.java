package cap08.interfaces.methods;

public class MyIFImp2 implements MyIF {
    // Nesse caso, implementações tanto de getUserID()
    // quanto de getAdminID() são fornecidas.
    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 42;
    }
}
