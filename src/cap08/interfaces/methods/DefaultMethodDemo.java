package cap08.interfaces.methods;

// Usa o metodo padrão.
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Pode chamar o metodo getUserID(), porque ele é
        // implementado explicitamente por MyIFImpl:
        System.out.println("User ID is: " + obj.getUserID());

        // Também pode chamar getAdminID(), por causa da
        // implementação padrão.
        System.out.println("Administrador ID is " + obj.getAdminID());
    }
}
